package weekend.d20210704;

import java.util.*;

public class T4 {

    public int longestCommonSubpath(int n, int[][] paths) {
        Arrays.sort(paths, Comparator.comparingInt(path -> path.length));


        String a = getString(paths[0]);
        String b = getString(paths[paths.length-1]);
        Set<String> set = getLCS(a, b);

        for (int i = 0; i + 1 < paths.length; i+=2) {
            String s = getString(paths[i]);
            String t = getString(paths[i + 1]);
            Set<String> temp = getLCS(s, t);
            set = merge(set, temp);
        }

        int r = 0;
        for (String s : set) {
            System.out.println(s);
            int t = s.split("_").length - 1;
            r = Math.max(t, r);
        }
        return r;

    }

    public Set<String> merge(Set<String> s, Set<String> t) {
        Set<String> set = new HashSet<>();
        for (String ss : s) {
            if (t.contains(ss)) {
                set.add(ss);
            }
        }
        return set;
    }

    public Set<String> getLCS(String s, String t) {
        if (s == null || t == null) {
            return new HashSet<>();
        }
        HashSet<String> res = new HashSet<>();

        int sLength = s.length();
        int tLength = t.length();
        int[][] dp = new int[sLength][tLength];
        for (int i = 0; i < sLength; i++) {
            for (int k = 0; k < tLength; k++) {
                if (s.charAt(i) == t.charAt(k)) {
                    if (i == 0 || k == 0) {
                        dp[i][k] = 1;
                    } else {
                        dp[i][k] = dp[i - 1][k - 1] + 1;
                    }
//                    result = Math.max(dp[i][k], result);
                    res.add(s.substring(Math.max(0,i - dp[i][k]), i));
                } else {
                    dp[i][k] = 0;
                }
            }
        }

        return res;
    }

    public String getString(int[] path) {
        StringBuilder sb = new StringBuilder();
        for (int p : path) {
            sb.append("_").append(p);
        }
        return sb.toString();
    }




}
