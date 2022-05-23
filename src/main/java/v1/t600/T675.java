package v1.t600;

import java.util.*;

public class T675 {

    public class Node {
        int x;
        int y;
        int val;

        public Node(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }


    Map<Integer, Integer> map = new HashMap<>();

    Queue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));

    int m;
    int n;
    List<List<Integer>> forest;
    int max;

    public int cutOffTree(List<List<Integer>> forest) {
        this.forest = forest;
        m = forest.size();
        n = forest.get(0).size();
        max = m * n;

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                int val = forest.get(y).get(x);
                if (val > 1) {
                    queue.offer(new Node(x, y, val));
                }
            }
        }

        int res = 0;

        Node pre = new Node(0, 0, 1);

        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            int step = find(pre, cur);
            if (step == -1) {
                return -1;
            }
            res += step;
            pre = cur;
        }

        return res;

    }

    private int find(Node pre, Node cur) {
        boolean[][] vi = new boolean[m][n];
        Queue<Node> q = new LinkedList<>();

        q.offer(pre);
        vi[pre.y][pre.x] = true;

        int level = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            while (len-- > 0) {
                Node node = q.poll();
                int x = node.x;
                int y = node.y;

                if (x == cur.x && y == cur.y) {
                    return level;
                }

                if (check(x + 1, y, vi)) {
                    q.offer(new Node(x + 1, y, 0));
                    vi[y][x + 1] = true;
                }
                if (check(x, y + 1, vi)) {
                    q.offer(new Node(x, y + 1, 0));
                    vi[y + 1][x] = true;
                }
                if (check(x - 1, y, vi)) {
                    q.offer(new Node(x - 1, y, 0));
                    vi[y][x - 1] = true;
                }
                if (check(x, y - 1, vi)) {
                    q.offer(new Node(x, y - 1, 0));
                    vi[y - 1][x] = true;
                }
            }
            level++;
        }

        return -1;
    }

    private boolean check(int x, int y, boolean[][] vi) {
        return x >= 0 && y >= 0 && x < n && y < m && forest.get(y).get(x) != 0 && !vi[y][x];
    }

}
