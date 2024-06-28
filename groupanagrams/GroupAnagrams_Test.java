package groupanagrams;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GroupAnagrams_Test {
    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void test(){
        assertEquals(3, groupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}).size());
    }
}
