package v1.t900;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T924 {
    public int minMalwareSpread(int[][] graph, int[] initial) {

        int len = graph.length;

        // 连通分量
        DiffSet set = new DiffSet(len);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    if (graph[i][j] == 1) {
                        set.union(i, j);
                    }
                }
            }
        }

        // 每个网络对应的节点数量
        int[] rank = set.getChildrenCount();

        // initial下公用的parent人数, 只有count[i]==1, 删除才有用
        int[] count = new int[len];

        Map<Integer, Integer> back = new HashMap<>();
        for (int v : initial) {
            int parentIdx = set.find(v);
            count[parentIdx]++;
            back.put(parentIdx, v);
        }

        // 查找arr[i]最大, 而count[i] = 1
        boolean exists = false;
        int res = len + 1;
        int idx = -1;
        for (int i = 0; i < len; i++) {
            if (count[i] == 1) {
                exists = true;
                if (rank[i] != 0) {
                    if (idx == -1) {
                        idx = i;
                        res = Math.min(res, back.get(idx));
                    } else if (rank[i] == rank[idx]) {
                        // 存在节点数量相同
                        idx = i;
                        res = Math.min(res, back.get(idx));
                    } else if (rank[i] > rank[idx]) {
                        idx = i;
                        res = back.get(idx);
                    }
                }
            }
        }

        if (!exists) {
            Arrays.sort(initial);
            return initial[0];
        }

        return res;
    }

    static public class DiffSet {
        int[] parent;

        public DiffSet(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public boolean cp(int id1, int id2) {
            return find(id1) == find(id2);
        }

        public int[] getChildrenCount() {
            int[] arr = new int[parent.length];
            for (int i = 0; i < parent.length; i++) {
                int idx = find(i);
                arr[idx]++;
            }
            return arr;
        }

        public int getNum() {
            int res = 0;
            for (int i = 0; i < parent.length; i++) {
                if (parent[i] == i) {
                    res++;
                }
            }
            return res;
        }

        public void union(int id1, int id2) {
            parent[find(id1)] = find(id2);
        }

        public int find(int idx) {
            while (parent[idx] != idx) {
                parent[idx] = parent[parent[idx]];
                idx = parent[idx];
            }
            return idx;
        }
    }


}
