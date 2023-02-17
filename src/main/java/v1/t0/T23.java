package v1.t0;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class T23 {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> queue = new ArrayList<>();

        for (ListNode n : lists) {
            add(queue, n);
        }

        ListNode res = new ListNode(-1);
        ListNode tail = res;
        while (!queue.isEmpty()) {
            ListNode node = queue.remove(0);

            tail.next = node;

            node = node.next;

            tail = tail.next;

            add(queue, node);
        }

        return res.next;
    }

    public void add(List<ListNode> p, ListNode node) {
        if (node == null) {
            return;
        }

        int l = 0;
        int r = p.size();

        while (l < r) {
            int m = (l + r) / 2;
            if (p.get(m).val < node.val) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        p.add(l, node);

    }
}
