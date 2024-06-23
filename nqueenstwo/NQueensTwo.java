package nqueenstwo;

public class NQueensTwo {

    static int output;

    public int totalNQueens(int n) {
        output = 0;
        String[][] chessTable = initializeChessBoard(n);
        recursiveBacktracking(0,chessTable,n);
        return output;
    }

    private void recursiveBacktracking(int colIndex, String[][] chessTable, int numberOfQueens){
        if(colIndex == numberOfQueens){
            output++;
        }
        for(int rowIndex =0; rowIndex<numberOfQueens; rowIndex++){
            if(isValid(rowIndex, colIndex, chessTable)){
                chessTable[rowIndex][colIndex] = "Q";
                recursiveBacktracking(colIndex+1, chessTable, numberOfQueens);
                chessTable[rowIndex][colIndex] = ".";
            }
        }
    }

    private boolean isValid(int rowIndex, int colIndex, String[][] chessTable){
        //no queens in same row
        for(int i=0; i < colIndex; i++){
            if(chessTable[rowIndex][i].equals("Q")){
                return false;
            }
        }
        //no queens in diagonal
        for(int i=rowIndex, j = colIndex; i>=0 && j>=0; i--,j--){
            if(chessTable[i][j].equals("Q")) {
                return false;
            }
        }
        for(int i=rowIndex, j =colIndex; i < chessTable.length && j >=0; i++, j--){
            if(chessTable[i][j].equals("Q")){
                return false;
            }
        }
        return true;
    }

    public String[][] initializeChessBoard(int n){
        String[][] chessTable = new String[n][n];
        for(int i=0; i<chessTable[0].length;i++){
            for(int j=0; j<chessTable[0].length;j++){
                chessTable[i][j] = ".";
            }
        }
        return chessTable;
    }
}
