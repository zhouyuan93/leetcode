package v1.mst;

import common.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MST02_02 {
    public int kthToLast(ListNode head, int k) {
        ListNode res = head;
        while (k-- > 0) {
            head = head.next;
        }
        while (head != null) {
            res = res.next;
            head = head.next;
        }
        return res.val;
    }
}
