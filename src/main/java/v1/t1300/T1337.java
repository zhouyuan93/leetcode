package v1.t1300;

import java.util.PriorityQueue;

public class T1337 {
    public int[] kWeakestRows(int[][] mat, int k) {

        PriorityQueue<Node> queue = new PriorityQueue<>(k, (x, y) -> {
            if (x.count == y.count) {
                return y.idx - x.idx;
            } else {
                return y.count - x.count;
            }
        });

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j : mat[i]) {
                count += j;
            }

            Node node = new Node(i, count);

            queue.add(node);
            if (queue.size() > k) {
                queue.poll();
            }

        }

        int[] res = new int[k];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = queue.poll().idx;
        }

        return res;

    }

    private class Node {
        int idx;
        int count;

        public Node(int idx, int count) {
            this.idx = idx;
            this.count = count;
        }
    }
}
