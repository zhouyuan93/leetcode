package v1.t100;

import java.util.HashMap;
import java.util.Map;

public class T138 {
    private class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
    public Node copyRandomList(Node head) {
        Node res = new Node(-1);

        Node p = res;
        Node h = head;

        Map<Node, Node> map = new HashMap<>();
        while (h != null) {
            p.next = new Node(h.val);
            p = p.next;
            map.put(h, p);
            h = h.next;
        }

        p = res.next;
        h = head;
        while (h != null) {
            if (h.random != null) {
                p.random = map.get(h.random);
            }
            p = p.next;
            h = h.next;
        }

        return res.next;
    }
}
