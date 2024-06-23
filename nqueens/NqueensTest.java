package nqueens;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NqueensTest {
    Nqueens nQueens = new Nqueens();
    @Test
    public void test(){
        assertEquals(2, nQueens.solveNQueens(4).size());
    }
}
