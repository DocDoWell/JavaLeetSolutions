package mergeSortedLists;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MergeSortedListsTest {

    MergeSortedLists mergeSortedLists = new MergeSortedLists();

    @Test
    public void Test1(){
        ListNode actual = mergeSortedLists.mergeKLists(new ListNode[]{});
        ListNode expected = new ListNode();
        assertEquals(actual,expected);
    }

    @Test
    public void Test2(){
        //input
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(4, a);
        ListNode c = new ListNode(1, b);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(3, e);
        ListNode g = new ListNode(1, f);
        ListNode h = new ListNode(6);
        ListNode i = new ListNode(2, h);
        //output
        ListNode j = new ListNode(6);
        ListNode k = new ListNode(5,j);
        ListNode l = new ListNode(4, k);
        ListNode m = new ListNode(4,l);
        ListNode n = new ListNode(3,m);
        ListNode o = new ListNode(2,n);
        ListNode p = new ListNode(1,o);
        ListNode q = new ListNode(1,p);
        //test
        ListNode actual = mergeSortedLists.mergeKLists(new ListNode[]{c,g,i});
        ListNode expected = q;
        assertEquals(actual,expected);
    }
}
