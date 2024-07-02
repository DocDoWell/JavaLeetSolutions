package pascalTriangle;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PascalTriangleTest {

    PascalTriangle pascalTriangle = new PascalTriangle();

    @Test
    public void test1(){
        List<List<Integer>> actual = pascalTriangle.generate(1);
        assertEquals(actual.size(), 1);
        assertTrue(actual.contains(List.of(1)));
    }

    @Test
    public void test2(){
        List<List<Integer>> actual = pascalTriangle.generate(5);
        assertEquals(actual.size(), 5);
        assertTrue(
                actual.contains(List.of(1)) &&
                        actual.contains(List.of(1,1)) &&
                        actual.contains(List.of(1,2,1)) &&
                        actual.contains(List.of(1,3,3,1)) &&
                        actual.contains(List.of(1,4,6,4,1)));
    }
}
