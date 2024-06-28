package groupanagrams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class GroupAnagrams_Test {
    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void test(){
        ArrayList<String> outputList1 = new ArrayList(Arrays.asList("eat", "tea", "ate"));
        ArrayList<String> outputList2 = new ArrayList(Arrays.asList("tan", "nat"));
        ArrayList<String> outputList3 = new ArrayList(Arrays.asList("bat"));
        List<List<String>>  actualOutput = groupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        assertEquals(3, actualOutput.size());
        assertTrue(actualOutput.contains(outputList1) && actualOutput.contains(outputList2) && actualOutput.contains(outputList3));
    }
}
