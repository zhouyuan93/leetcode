package v1.t2100;

import common.ListNode;

public class T2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode p = head;

        while (p.next != null) {
            ListNode next = p.next;
            if (next.val == 0) {
                if (next.next != null) {
                    p = next;
                }else{
                    p.next = null;
                }
            }else{
                p.val += next.val;
                p.next = next.next;
            }
        }

        return head;

    }
}
