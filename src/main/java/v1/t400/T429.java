package v1.t400;

import java.util.ArrayList;
import java.util.List;

public class T429 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(Node node, int f) {
        if (node == null) {
            return;
        }

        if (res.size() <= f) {
            res.add(new ArrayList<>());
        }
        res.get(f).add(node.val);

        if (node.children == null) {
            return;
        }

        f++;
        for (Node child : node.children) {
            dfs(child, f);
        }
    }
}
