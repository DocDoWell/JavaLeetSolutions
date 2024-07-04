package minimumPath;

public class MinimumPath {

    public int minPathSum(int[][] grid) {
        int[][] board = new int[grid.length][grid[0].length];

        for(int col =0; col < board.length; col++){
           if(col == 0){
               board[col][0] = grid[col][0];
           }else{
               board[col][0] = grid[col][0] + board[col-1][0];
           }
        }

        for(int row =0; row < board[0].length; row++){

            if(row == 0){
                board[0][row] = grid[0][row];
            }else{
                board[0][row] = grid[0][row] + board[0][row-1];
            }
        }

        for (int col = 1; col < board.length; col++) {
            for (int row = 1; row < board[col].length; row++) {
                board[col][row] = Math.min(
                        board[col-1][row]+grid[col][row],
                        board[col][row-1]+grid[col][row]
                );
            }
        }

        return  board[grid.length-1][grid[0].length-1];
    }
}
