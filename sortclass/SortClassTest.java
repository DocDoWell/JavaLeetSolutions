package sortclass;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SortClassTest {

    SortClass sortClass = new SortClass();

    @Test
    public void test1(){
        int[] nums =  new int[]{2,0,2,1,1,0};
        sortClass.sortColors(nums);
        for(int i =0; i < nums.length-1; i++){
            assertTrue(nums[i] <= nums[i+1]);
        }
    }

    @Test
    public void test2(){
        int[] nums =  new int[]{2,0,1};
        sortClass.sortColors(nums);
        for(int i =0; i < nums.length-1; i++){
            assertTrue(nums[i] <= nums[i+1]);
        }
    }
    
}
