package v1;

import common.ListNode;

import java.util.HashMap;

/**
 * @author yuan.zhou
 */
public class T1171 {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;

        HashMap<Integer, ListNode> memory = new HashMap<>();

        int sum = 0;
        for (ListNode i = res; i != null; i = i.next) {
            sum += i.val;
            memory.put(sum, i);
        }

        sum = 0;
        for (ListNode i = res; i != null; i = i.next) {
            sum += i.val;
            i.next = memory.get(sum).next;
        }

        return res.next;

    }
}
