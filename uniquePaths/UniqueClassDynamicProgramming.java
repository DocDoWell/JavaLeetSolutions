package uniquePaths;

public class UniqueClassDynamicProgramming {

    public int uniquePaths(int m, int n) {
        int[][] board = new int[m][n];

        for(int col =0; col < board.length; col++){
            board[col][0] = 1;
        }

        for(int row =0; row < board[0].length; row++){
            board[0][row] = 1;
        }

        System.out.println("before");
        displayBoard(board);

        for (int column = 1; column < board.length; column++) {
            for (int row = 1; row < board[column].length; row++) {
                board[column][row] = board[column-1][row]+board[column][row-1];
            }
        }

        System.out.println("after");
        displayBoard(board);

        return  board[m-1][n-1];
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
