package v1.t0;

import common.ListNode;

public class T25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p = head;

        ListNode res = new ListNode(-1);
        head = res;

        ListNode temp = null;
        int tLen = 0;

        while (true) {
            ListNode tail = null;
            while (tLen < k && p != null) {
                if (temp == null) {
                    temp = p;
                    p = p.next;
                    temp.next = null;
                    tail = temp;
                } else {
                    ListNode x = p;

                    p = p.next;

                    x.next = temp;
                    temp = x;
                }
                tLen++;
            }
            if (tLen == k) {
                res.next = temp;
                res = tail;
                temp = null;
                tLen = 0;
            } else {
                while (tLen > 0) {
                    ListNode y = temp.next;
                    if (res.next == null) {
                        res.next = temp;
                        temp.next = null;
                    } else {
                        ListNode x = res.next;
                        res.next = temp;
                        temp.next = x;
                    }
                    temp = y;
                    tLen--;
                }
                break;
            }
        }

        return head.next;

    }
}
