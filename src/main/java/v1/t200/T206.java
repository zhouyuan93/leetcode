package v1.t200;

import common.ListNode;

/**
 * @author yuan.zhou
 */
public class T206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p2 = head.next;
        ListNode p1 = head;
        p1.next = null;
        while (p2 != null) {
            ListNode p3 = p2.next;
            p2.next = null;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }

        return p1;

    }
}
