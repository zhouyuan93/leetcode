package v1.t900;

import java.util.*;

public class T936 {
    public int[] movesToStamp(String s, String t) {
        char[] stamp = s.toCharArray();
        char[] target = t.toCharArray();

        int m = s.length();
        int n = t.length();

        int[] inDegree = new int[n - m + 1];
        Arrays.fill(inDegree, m);

        List<Integer>[] edges = new List[n];
        for (int i = 0; i < edges.length; i++) {
            edges[i] = new ArrayList<>();
        }

        boolean[] seen = new boolean[n];

        Queue<Integer> queue = new ArrayDeque<Integer>();

        for (int i = 0; i < n - m + 1; i++) {
            // 从每一个起点 遍历stamp 如果相同入度-- 否则假如邻接表
            for (int j = 0; j < m; j++) {
                if (target[i + j] == stamp[j]) {
                    inDegree[i]--;
                    if (inDegree[i] == 0) {
                        queue.offer(i);
                    }
                } else {
                    // 邻接表 这个点影响了哪几个 inDegree[i]
                    edges[i + j].add(i);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            ans.add(cur);

            for (int i = 0; i < m; i++) {
                int p = i + cur;
                if (!seen[p]) {
                    seen[p] = true;
                    for (int j = 0; j < edges[p].size(); j++) {
                        Integer x = edges[p].get(j);
                        inDegree[x]--;
                        if (inDegree[x] == 0) {
                            queue.offer(x);
                        }
                    }
                }
            }

        }

        if (ans.size() < n - m + 1) {
            return new int[0];
        }

        int[] res = new int[ans.size()];
        for (int i = 0, j = ans.size() - 1; i < ans.size(); i++,j--) {
            res[j] = ans.get(i);
        }

        return res;

    }

}
