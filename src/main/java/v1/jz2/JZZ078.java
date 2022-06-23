package v1.jz2;

import common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class JZZ078 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(l -> l.val));

        for (ListNode node : lists) {
            if (node == null) {
                continue;
            }
            priorityQueue.add(node);
        }

        ListNode root = new ListNode(-1);
        ListNode end = root;
        while (!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll();
            end.next = node;
            if (node.next != null) {
                priorityQueue.offer(node.next);
            }
            end = end.next;
        }
        end.next = null;

        return root.next;

    }
}
