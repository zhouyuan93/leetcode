package v1.jz;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JZ38 {


    HashSet<String> set = new HashSet<>();
    // 最长10个字符
    boolean[] vis = new boolean[10];

    public String[] permutation(String s) {
        char[] cs = s.toCharArray();
        dfs(cs, 0, "");

        String[] ans = new String[set.size()];
        int idx = 0;
        for (String str : set) {
            ans[idx++] = str;
        }

        return ans;
    }

    void dfs(char[] cs, int u, String cur) {
        int n = cs.length;
        if (u == n) {
            set.add(cur);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                vis[i] = true;
                dfs(cs, u + 1, cur + cs[i]);
                vis[i] = false;
            }
        }
    }


}
