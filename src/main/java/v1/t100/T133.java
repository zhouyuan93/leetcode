package v1.t100;

import common.Node;

import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingQueue;

public class T133 {
    public Node cloneGraph(Node node) {
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
                Node n ;
                if (copyMap.containsKey(neighbor.val)) {
                    n = copyMap.get(neighbor.val);
                }else{
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
