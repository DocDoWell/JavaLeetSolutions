package firstMissingPositive;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FirstMissingPositiveTest {

    FirstMissingPositive FirstMissingPositive = new FirstMissingPositive();

    @Test
    public void Test1(){
        assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{1,2,0}),3);
    }
    @Test
    public void Test2(){
        assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{3,4,-1,1}),2);
    }
    @Test
    public void Test3(){
        assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{7,8,9,11,12}),1);
    }
    @Test
    public void Test4(){
        assertEquals(FirstMissingPositive.firstMissingPositive(new int[]{0,2,2,1,1}),3);
    }
}
