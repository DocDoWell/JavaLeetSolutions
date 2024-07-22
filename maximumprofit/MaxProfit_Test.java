package maximumprofit;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MaxProfit_Test{

    MaxProfit maxProfit = new MaxProfit();

    @Test
    public void test1(){
        int[] input = new int[]{7,1,5,3,6,4};
        assertEquals(5,maxProfit.maxProfit(input));
    }

    @Test
    public void test2(){
        int[] input = new int[]{7,6,4,3,1};
        assertEquals(0,maxProfit.maxProfit(input));
    }

    @Test
    public void test3(){
        int[] input = new int[]{3,2,6,5,0,3};
        assertEquals(4,maxProfit.maxProfit(input));
    }

}
