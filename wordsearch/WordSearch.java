package wordsearch;

public class WordSearch {

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int row =0; row < board.length; row++){
            for(int col =0; col < board[row].length; col++){
                if(solve(row,col,board,visited,word,"")){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean solve(int row, int col, char[][] board, boolean[][] visited, String word, String path){
        if(path.equals(word)){
            return true;
        }

        if(isValid(row, col, board, visited, word, path)){
            visited[row][col] = true;
            path = path + board[row][col];
            if(solve(row, col-1, board, visited, word, path)){
                return true;
            }
            if(solve(row, col+1, board, visited, word, path)){
                return true;
            }
            if(solve(row-1, col, board, visited, word, path)){
                return true;
            }
            if(solve(row+1, col, board, visited, word, path)){
                return true;
            }
            visited[row][col] = false;
        }

        return false;
    }

    private boolean isValid(int row, int col, char[][] board, boolean[][] visited, String word, String path){
        if( row <0 || row >= board.length){
            return false;
        }

        if( col <0 || col >= board[row].length){
            return false;
        }

        if(visited[row][col]){
            return false;
        }

        if(word.charAt(Math.max(0, path.length())) != board[row][col]){
            return false;
        }

        return true;
    }
}
