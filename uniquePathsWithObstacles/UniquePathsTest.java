package uniquePathsWithObstacles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {

    UniquePaths uniquePaths = new UniquePaths();

    @Test
    public void test1(){
        int actual = uniquePaths.uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}});
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int actual = uniquePaths.uniquePathsWithObstacles(new int[][]{{1,0,0}});
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int actual = uniquePaths.uniquePathsWithObstacles(new int[][]{{0,1},{0,0}});
        int expected = 1;
        assertEquals(expected, actual);
    }
}
