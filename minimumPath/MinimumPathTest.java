package minimumPath;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumPathTest {

    MinimumPath minimumPath = new MinimumPath();

    @Test
    public void test1(){
        int actual = minimumPath.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int actual = minimumPath.minPathSum(new int[][]{{1,2,3},{4,5,6}});
        int expected = 12;
        assertEquals(expected, actual);
    }




}
