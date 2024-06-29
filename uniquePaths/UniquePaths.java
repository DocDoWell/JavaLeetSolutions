package uniquePaths;

public class UniquePaths {

    public static int paths;

    public int uniquePaths(int m, int n) {
        paths = 0;
        solveProblem(0,0,m,n);
        return paths;
    }

    private void solveProblem(int col, int row, int colLength, int rowLength){
        // base
        if(col == colLength-1 && row == rowLength-1){
            paths++;
        }

        if(col+1 < colLength){
            solveProblem(col+1,row,colLength,rowLength);
        }

        if(row+1 < rowLength){
            solveProblem(col,row+1,colLength,rowLength);
        }

    }
}
