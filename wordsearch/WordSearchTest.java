package wordsearch;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordSearchTest {

    WordSearch wordSearch = new WordSearch();

    @Test
    public void test1(){
        boolean actual = wordSearch.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED");
        assertTrue(actual);
    }

    @Test
    public void test2(){
        boolean actual = wordSearch.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"SEE");
        assertTrue(actual);
    }

    @Test
    public void test3(){
        boolean actual = wordSearch.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCB");
        assertFalse(actual);
    }

    @Test
    public void test4(){
        boolean actual = wordSearch.exist(new char[][]{{'C','A','A'},{'A','A','A'},{'B','C','D'}},"AAB");
        assertTrue(actual);
    }

}
