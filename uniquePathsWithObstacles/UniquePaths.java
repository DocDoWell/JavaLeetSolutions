package uniquePathsWithObstacles;

public class UniquePaths {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] board = new int[obstacleGrid.length][obstacleGrid[0].length];

       for(int col =0; col < board.length; col++){
           if(obstacleGrid[col][0] == 0){
               board[col][0] = 1;
           }else{
               while(col < board.length){
                   board[col][0] = 0;
                   col++;
               }
           }
       }

       for(int row =0; row < board[0].length; row++){
           if(obstacleGrid[0][row] == 0){
               board[0][row] = 1;
           }else{
               while(row < board[0].length){
                   board[0][row] = 0;
                   row++;
               }
           }
       }

       for (int column = 1; column < board.length; column++) {
           for (int row = 1; row < board[column].length; row++) {
               if(obstacleGrid[column][row] == 0){
                   board[column][row] = board[column-1][row]+board[column][row-1];
               }else{
                   board[column][row] = 0;
               }
           }
       }

       return  board[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }

    private void displayBoard(int[][] board){
        for (int column = 0; column < board.length; column++) {
            for (int row = 0; row < board[column].length; row++) {
                System.out.print(board[column][row]);
            }
            System.out.println("");
        }
    }
}
