package wordSubsets;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    Solution sol = new Solution();

    @Test
    public void test1(){
        List<String> output = sol.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"e","o"});
        Assert.assertTrue(output.contains("facebook"));
        Assert.assertTrue(output.contains("google"));
        Assert.assertTrue(output.contains("leetcode"));
        Assert.assertFalse(output.contains("apple"));
        Assert.assertFalse(output.contains("amazon"));
    }
}
