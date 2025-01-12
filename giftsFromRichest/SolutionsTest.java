package giftsFromRichest;

import org.junit.Assert;
import org.junit.Test;

public class SolutionsTest {
    Solution sol = new Solution();
    @Test
    public void test1(){
        Assert.assertEquals(sol.pickGifts(new int[]{25,64,9,4,100}, 4),29);
    }
}
