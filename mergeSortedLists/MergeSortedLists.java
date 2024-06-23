package mergeSortedLists;

import java.util.PriorityQueue;

public class MergeSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> considered = new PriorityQueue<>();
        for(ListNode ln : lists){
            while(ln != null){
                considered.add(ln.val);
                ln = ln.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(!considered.isEmpty()){
            ListNode newNode = new ListNode(considered.poll());
            current.next = newNode;
            current =  current.next;
        }
        return dummy.next;
    }
}


