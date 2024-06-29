package uniquePaths;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsTest {
    UniquePaths uniquePaths = new UniquePaths();
    UniqueClassDynamicProgramming uniquePathsDP = new UniqueClassDynamicProgramming();

    @Test
    public void test1(){
     int actual = uniquePaths.uniquePaths(3,7);
     int expected = 28;
     assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int actual = uniquePaths.uniquePaths(3,2);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int actual = uniquePathsDP.uniquePaths(3,2);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        int actual = uniquePathsDP.uniquePaths(3,7);
        int expected = 28;
        assertEquals(expected, actual);
    }
}
