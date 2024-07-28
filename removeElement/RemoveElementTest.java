package removeElement;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RemoveElementTest {

    RemoveElement removeElement = new RemoveElement();

    @Test
    public void test1(){
        int actual = removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        int expected = 5;
        assertEquals(expected, actual);
    }

}
