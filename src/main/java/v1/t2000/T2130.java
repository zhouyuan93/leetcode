package v1.t2000;

import common.ListNode;

public class T2130 {
    public int pairSum(ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode p = null;

        ListNode l1 = head;
        ListNode l2 = head.next;

        while (l2.next != null) {
            ListNode t = l1.next;
            l1.next = p;
            p = l1;
            l1 = t;
            l2 = l2.next.next;
        }

        ListNode t = l1.next;
        l1.next = p;
        p = l1;
        l1 = t;

        ListNode p2 = l1;

        int res = Integer.MIN_VALUE;
        while (p2 != null) {
            res = Math.max(p2.val + p.val, res);
            p = p.next;
            p2 = p2.next;
        }

        return res;

    }
}
