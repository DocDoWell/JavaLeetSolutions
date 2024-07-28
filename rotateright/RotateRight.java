package rotateright;

import java.util.HashMap;
import java.util.Map;

public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || k == 0 || head.next == null){
            return head;
        }

        Map<Integer, ListNode> positions = new HashMap<>();
        int layer = 0;

        while(head != null){
            layer++;
            positions.put(layer, head);
            head = head.next ;
        }

        int rotations = k%layer;

        if(rotations == 0){
            return positions.get(1);
        }

        positions.get(layer).next = positions.get(1);

        positions.get(layer-rotations).next = null;

        return positions.get((layer-rotations)+1);
    }
}




