package interleavingString;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class InterleavingString_Test {

    InterleavingString_backtracking interleavingStringBacktracking = new InterleavingString_backtracking();

    @Test
    public void Test0(){
        assertTrue(interleavingStringBacktracking.isInterleave("", "", ""));
    }

    @Test
    public void Test1(){
        assertTrue(interleavingStringBacktracking.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
    }

    @Test
    public void Test2(){
        assertTrue(interleavingStringBacktracking.isInterleave("aa", "ab", "aaba"));
    }

    @Test
    public void Test3(){
        assertFalse(interleavingStringBacktracking.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}
