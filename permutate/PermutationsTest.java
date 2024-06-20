package permutate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class PermutationsTest {
    Permutations permutations = new Permutations();
    @Test
    public void test1(){
        List<List<Integer>> actual = permutations.permute(new int[]{1,2,3,4,5});
        assertEquals(actual.size(),120);
    }

    @Test
    public void test2(){
        List<List<Integer>> actual = permutations.permute(new int[]{0,1});
        List<Integer> output1 =  Arrays.asList(1, 0);
        List<Integer> output2 =  Arrays.asList(0, 1);
        assertTrue(actual.contains(output1) && actual.contains(output2));
    }
}
