package v1.t100;


import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class T133 {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node[] trans = new Node[101];

        Node res = new Node(node.val, new ArrayList<>());
        trans[node.val] = res;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node p = queue.poll();
            for (Node n : p.neighbors) {
                if (trans[n.val] == null) {
                    trans[n.val] = new Node(n.val, new ArrayList<>());
                    queue.offer(n);
                }
                trans[p.val].neighbors.add(trans[n.val]);
            }
        }

        return res;
    }


    public Node cloneGraph2(Node node) {
        if (node == null) {
            return null;
        }

        if (node.neighbors == null || node.neighbors.size() == 0) {
            Node res = new Node();
            res.val = node.val;
            return res;
        }

        //初始化第一个节点


        Queue<Node> nextQueue = new LinkedBlockingQueue<>();
        nextQueue.offer(node);

        Map<Integer, Node> copyMap = new TreeMap<>();
        Node res = new Node();
        res.val = node.val;
        copyMap.put(node.val, res);

        while (!nextQueue.isEmpty()) {
            Node p = nextQueue.poll();
            Node copyP = copyMap.get(p.val);

            for (Node neighbor : p.neighbors) {
                Node n;
                if (copyMap.containsKey(neighbor.val)) {
                    n = copyMap.get(neighbor.val);
                } else {
                    n = new Node();
                    n.val = neighbor.val;
                    copyMap.put(n.val, n);
                    nextQueue.offer(neighbor);
                }
                copyP.neighbors.add(n);
            }
        }

        return res;

    }

}
