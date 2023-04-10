package v1.t1000;

import common.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class T1019 {
    public int[] nextLargerNodes(ListNode head) {
        ListNode p = null;

        int len = 0;
        while (head != null) {
            ListNode n = head.next;
            head.next = p;
            p = head;
            head = n;
            len++;
        }

        head = p;

        int[] res = new int[len];
        int idx = len - 1;

        Deque<Integer> queue = new ArrayDeque<>();
        while (head != null) {
            int v = head.val;
            while (!queue.isEmpty() && queue.peekLast() <= v) {
                queue.pollLast();
            }
            if (!queue.isEmpty()) {
                res[idx] = queue.peekLast();
            }
            queue.offerLast(v);
            head = head.next;
            idx--;
        }

        return res;
    }
}
