package reverseWords;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReverseWordsTest {
    ReverseWords reverseWords = new ReverseWords();

    @Test
    public void test1(){
        String actual = reverseWords.reverseWords("the sky is blue");
        String expected = "blue is sky the";
        assertEquals(actual,expected);
    }

    @Test
    public void test2(){
        String actual = reverseWords.reverseWords("  hello world  ");
        String expected = "world hello";
        assertEquals(actual,expected);
    }

    @Test
    public void test3(){
        String actual = reverseWords.reverseWords("a good   example");
        String expected = "example good a";
        assertEquals(actual,expected);
    }
}
