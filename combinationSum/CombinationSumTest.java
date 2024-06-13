package combinationSum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CombinationSumTest {

    CombinationSum combinationSum = new CombinationSum();
    @Test
    public void test1(){
        List<List<Integer>> actual = combinationSum.combinationSum(new int[]{2}, 1);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(actual.equals(expected),true);
    }
    @Test
    public void test2(){
        List<List<Integer>> actual = combinationSum.combinationSum(new int[]{2,3,5}, 8);
        assertEquals(actual.size(),3);
        assertEquals(actual.contains(Arrays.asList(2,2,2,2)),true);
        assertEquals(actual.contains(Arrays.asList(2,3,3)),true);
        assertEquals(actual.contains(Arrays.asList(3,5)),true);
    }

}


