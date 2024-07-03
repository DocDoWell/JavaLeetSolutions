package plusOne;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusOneTest {

    PlusOne plusOne = new PlusOne();

    @Test
    public void test1(){
        int[] actual = plusOne.plusOne(new int[]{1,2,3});
        int[] expected = new int[]{1,2,4};
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
    }

    @Test
    public void test2(){
        int[] actual = plusOne.plusOne(new int[]{4,3,2,1});
        int[] expected = new int[]{4,3,2,2};
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
        assertEquals(expected[3], actual[3]);
    }

    @Test
    public void test3(){
        int[] actual = plusOne.plusOne(new int[]{9});
        int[] expected = new int[]{1,0};
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void test4(){
        int[] actual = plusOne.plusOne(new int[]{9,8,9});
        int[] expected = new int[]{9,9,0};
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
    }
}
