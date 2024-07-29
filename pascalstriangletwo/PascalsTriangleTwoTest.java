package pascalstriangletwo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PascalsTriangleTwoTest {

    PascalsTriangleTwo pascalsTriangleTwo = new PascalsTriangleTwo();

    @Test
    public void test1(){
        List<Integer> actual = pascalsTriangleTwo.getRow(3);
        assertEquals(actual.size(), 4);
        assertTrue(actual.get(0) == 1);
        assertTrue(actual.get(1) == 3);
        assertTrue(actual.get(2) == 3);
        assertTrue(actual.get(3) == 1);

    }
}
