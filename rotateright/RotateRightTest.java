package rotateright;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateRightTest {
    RotateRight rotateRight = new RotateRight();

    @Test
    public void test1(){
        ListNode five = new ListNode(5, null);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        ListNode actualThree = new ListNode(3, null);
        ListNode actualTwo = new ListNode(2, actualThree);
        ListNode actualOne = new ListNode(1, actualTwo);
        ListNode actualFive = new ListNode(5, actualOne);
        ListNode actualFour = new ListNode(4, actualFive);

        ListNode actual = rotateRight.rotateRight(one, 2);
        assertEquals(actualFour, actual);

    }

    @Test
    public void test2(){

        ListNode two = new ListNode(2, null);
        ListNode one = new ListNode(1, two);

        ListNode actualOne = new ListNode(1, null);
        ListNode actualTwo = new ListNode(2, actualOne);

        ListNode actual = rotateRight.rotateRight(one, 1);
        assertEquals(actualTwo, actual);

    }

    @Test
    public void test3(){

        ListNode two = new ListNode(2, null);
        ListNode one = new ListNode(1, two);

        ListNode actual = rotateRight.rotateRight(one, 2);
        assertEquals(one, actual);

    }
}
