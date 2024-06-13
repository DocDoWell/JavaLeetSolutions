package validSudoku;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i < 9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(!isRowValid(board, board[i][j],i,j)){
                        return false;
                    }
                    if(!isColumnValid(board, board[i][j],i,j)){
                        return false;
                    }
                    if(!isBoxValid(board, board[i][j],i,j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isRowValid(char[][] board, char num, int rowIndex, int colIndex){
        for(int i=rowIndex+1; i < 9; i++){
            if(board[i][colIndex] == num){
                return false;
            }
        }
        return true;
    }

    public boolean isColumnValid(char[][] board, char num, int rowIndex, int colIndex){
        for(int i=colIndex+1; i < 9; i++){
            if(board[rowIndex][i] == num){
                return false;
            }
        }
        return true;
    }

    public boolean isBoxValid(char[][] board, char num, int rowIndex, int colIndex){
        int boxRowOffset = (rowIndex/3)* 3;
        int boxColumnOffset = (colIndex/3)* 3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(boxRowOffset+i != rowIndex && boxColumnOffset+j != colIndex){
                    if(board[boxRowOffset+i][boxColumnOffset+j] == num){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
