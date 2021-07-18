package weekend.d20210718;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class T3 {
    class Node{
        long v;
        int x;

        public Node(long v, int x) {
            this.v = v;
            this.x = x;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "v=" + v +
                    ", x=" + x +
                    '}';
        }
    }
    public long maxPoints(int[][] points) {
        if(points == null || points.length == 0){
            return 0;
        }
        int m = points.length;
        int n = points[0].length;


        PriorityQueue<Node> queue = new PriorityQueue<Node>((x, y) -> (int) (y.v - x.v));
        for (int i = 0; i < points[m-1].length; i++) {
            queue.add(new Node(points[m-1][i], i));
        }

        int res = Integer.MIN_VALUE;
        for (int i = points.length - 2; i >= 0; i--) {

            int[] p = points[i];
            PriorityQueue<Node> temp = new PriorityQueue<>((x, y) -> (int) (y.v - x.v));
            for (int j = 0; j < p.length; j++) {
                long max = Integer.MIN_VALUE;
                for (Node node : queue) {
                    int a = Math.abs(node.x - j);
                    long t = node.v - a;
                    max = Math.max(t, max);
                    if (node.v < max - n) {
                        break;
                    }
                }
                temp.add(new Node(max + p[j], j));
            }
            queue = temp;
        }

        return queue.poll().v;
    }
}
