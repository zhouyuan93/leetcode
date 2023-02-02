package v1.t1100;

import java.util.*;

public class T1129 {
    class Node {
        List<Integer> list;

        public Node() {
            this.list = new ArrayList<>();
        }

        public void add(int x) {
            this.list.add(x);
        }

        public List<Integer> getList() {
            return list;
        }
    }

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] res = new int[n];
        Arrays.fill(res, -1);

        int count = n;

        Node[] redNodes = new Node[100];
        Node[] blueNodes = new Node[100];

        for (int i = 0; i < redEdges.length; i++) {
            int[] x = redEdges[i];
            if (redNodes[x[0]] == null) {
                redNodes[x[0]] = new Node();
            }
            redNodes[x[0]].add(x[1]);
        }

        for (int i = 0; i < blueEdges.length; i++) {
            int[] x = blueEdges[i];
            if (blueNodes[x[0]] == null) {
                blueNodes[x[0]] = new Node();
            }
            blueNodes[x[0]].add(x[1]);
        }

        Set<Integer> red = new HashSet<>();
        Set<Integer> blue = new HashSet<>();
        Set<Integer> redTemp = new HashSet<>();
        Set<Integer> blueTemp = new HashSet<>();


        res[0] = 0;
        int step = 1;
        if (redNodes[0] != null) {
            for (Integer x : redNodes[0].getList()) {
                if (x != 0 &&res[x] == -1) {
                    res[x] = step;
                }
                red.add(x);
            }
        }
        if (blueNodes[0] != null) {
            for (Integer x : blueNodes[0].getList()) {
                if (x != 0 && res[x] == -1) {
                    res[x] = step;
                }
                blue.add(x);
            }
        }

        while (step < 2 * n && (!red.isEmpty() || !blue.isEmpty())) {
            step++;
            for (Integer x : red) {
                if (blueNodes[x] != null) {
                    for (Integer y : blueNodes[x].getList()) {
                        if (x != y && res[y] == -1) {
                            res[y] = step;
                        }
                        blueTemp.add(y);
                    }
                }
            }
            for (Integer x : blue) {
                if (redNodes[x] != null) {
                    for (Integer y : redNodes[x].getList()) {
                        if (x != y && res[y] == -1) {
                            res[y] = step;
                        }
                        redTemp.add(y);
                    }
                }
            }
            red = redTemp;
            blue = blueTemp;
            redTemp = new HashSet<>();
            blueTemp = new HashSet<>();
        }

        return res;

    }
}
