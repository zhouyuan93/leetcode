package v1.t100;

import java.util.ArrayList;
import java.util.List;

public class T117 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    private List<Node> list = new ArrayList<>();
    public Node connect(Node root) {
        dfs(root, 0);
        return root;
    }

    public void dfs(Node node, int floor) {
        if (node == null) {
            return;
        }
        if (floor < list.size()) {
            node.next = list.get(floor);
            list.set(floor, node);
        }else{
            list.add(node);
        }
        floor++;
        dfs(node.right,floor);
        dfs(node.left, floor);
    }
}
