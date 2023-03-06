package v1.t0;

import common.ListNode;

public class T61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode end = head;
        int len = 1;
        while (end.next != null) {
            len++;
            end = end.next;
        }
        k = k % len;
        len = len - k - 1;

        ListNode p = head;
        for (int i = 0; i < len; i++) {
            p = p.next;
        }

        end.next = head;
        head = p.next;
        p.next = null;

        return head;
    }

}
