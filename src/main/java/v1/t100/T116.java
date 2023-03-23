package v1.t100;

import java.util.ArrayDeque;
import java.util.Deque;

public class T116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Deque<Node> queue = new ArrayDeque<>();

        int len = 1;
        int t = 0;
        queue.addLast(root);

        while (!queue.isEmpty()) {
            Node n = queue.poll();
            t++;
            System.out.println(t);
            if (t == len) {
                t = 0;
                len *= 2;
            }else{
                n.next = queue.peek();
                t++;
            }
            if (n.left != null) {
                queue.addLast(n.left);
                queue.addLast(n.right);
            }
        }

        return root;

    }


}
