package wordladder;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordLadderTest {

    WordLadder wordLadder = new WordLadder();

    @Test
    public void test1(){
        List<String> input= Arrays.asList("hot","dot","dog","lot","log");
        assertEquals(0, wordLadder.ladderLength("hit", "cog", input));
    }

    @Test
    public void test2(){
        List<String> input= Arrays.asList("hot","dot","dog","lot","log","cog");
        assertEquals(5, wordLadder.ladderLength("hit", "cog", input));
       // "hit" -> "hot" -> "dot" -> "dog" -> "cog"

    }

    @Test
    public void test3(){
        List<String> input= Arrays.asList("hot","dog");
        assertEquals(0, wordLadder.ladderLength("hot", "dog", input));
    }

    @Test
    public void test4(){
        List<String> input= Arrays.asList("hot","dog", "dot");
        assertEquals(3, wordLadder.ladderLength("hot", "dog", input));
    }

}
