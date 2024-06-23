package nqueenstwo;

import nqueens.Nqueens;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NQueensTwoTest {
    NQueensTwo nQueens = new NQueensTwo();
    @Test
    public void test1(){
        assertEquals(2, nQueens.totalNQueens(4));
    }

    @Test
    public void test2(){
        assertEquals(1, nQueens.totalNQueens(1));
    }
}
