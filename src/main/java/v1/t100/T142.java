package v1.t100;

import common.ListNode;

public class T142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }

        ListNode p1 = head.next;
        ListNode p2 = head.next.next;

        while(p1 != p2){
            if (p2.next == null || p2.next.next == null) {
                return null;
            }
            p1 = p1.next;
            p2 = p2.next.next;
        }

        p1 = head;

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;

    }
}
