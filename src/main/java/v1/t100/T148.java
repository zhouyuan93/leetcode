package v1.t100;

import common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T148 {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p.val));

        while (head != null) {
            queue.add(head);
            head = head.next;
        }

        head = new ListNode(-1);

        ListNode p = head;

        while (!queue.isEmpty()) {
            p.next = queue.poll();
            p = p.next;
            p.next = null;
        }

        return head.next;


    }
}
