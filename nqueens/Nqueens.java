package nqueens;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {

    static String[][] chessTable;
    static int numberOfQueens;

    public List<List<String>> solveNQueens(int n) {
        chessTable = new String[n][n];
        initializeChessBoard(chessTable);
        numberOfQueens = n;
        List<List<String>> output = new ArrayList<>();
        recursiveBacktracking(0,chessTable,n, output);
        return output;
    }

    private void recursiveBacktracking(int colIndex, String[][] chessTable, int numberOfQueens, List<List<String>> output){
        if(colIndex == numberOfQueens){
            output.add(chessBoardtoList(chessTable));
        }
        for(int rowIndex =0; rowIndex<numberOfQueens; rowIndex++){
            if(isValid(rowIndex, colIndex, chessTable)){
                chessTable[rowIndex][colIndex] = "Q";
                recursiveBacktracking(colIndex+1, chessTable, numberOfQueens, output);
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

    public void initializeChessBoard(String[][] chessTable){
        for(int i=0; i<chessTable[0].length;i++){
            for(int j=0; j<chessTable[0].length;j++){
                chessTable[i][j] = ".";
            }
        }
    }

    public List<String> chessBoardtoList(String[][] chessTable){
        List<String> output = new ArrayList<>();
        for(int i=0; i<chessTable[0].length;i++){
            String op = "";
            for(int j=0; j<chessTable[0].length;j++){
                op = op+(chessTable[i][j]);
            }
            output.add(op);
        }
        return output;
    }
}
