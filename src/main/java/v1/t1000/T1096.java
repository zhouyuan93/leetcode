package v1.t1000;

import java.util.*;
import java.util.stream.Collectors;

public class T1096 {
    public List<String> braceExpansionII(String expression) {
        char[] chars = expression.toCharArray();

        // 构建括号索引
        int[] idx = new int[expression.length()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '{') {
                stack.push(i);
            } else if (c == '}') {
                int j = stack.pop();
                idx[j] = i;
            }
        }

        Set<String> node = getNode(chars, 0, chars.length - 1, idx);

        List<String> res = node.stream().sorted().collect(Collectors.toList());

        return res;
    }

    public Set<String> getNode(char[] chars, int l, int r, int[] idx) {
        Set<String> res = new HashSet<>();

        Set<String> cache = new HashSet<>();
        cache.add("");

        for (int i = l; i <= r; i++) {
            char c = chars[i];
            if (c == '{') {
                Set<String> set = getNode(chars, i + 1, idx[i] - 1, idx);
                i = idx[i];
                cache = merge(cache, set);
            } else if ('a' <= c && c <= 'z') {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                int t = i + 1;
                while (t < r && 'a' < chars[t] && chars[t] < 'z') {
                    sb.append(chars[t]);
                    t++;
                }
                i = t - 1;
                cache = merge(cache, sb.toString());
            } else if (c == ',') {
                res.addAll(cache);
                cache = new HashSet<>();
                cache.add("");
            }
        }

        res.addAll(cache);
        return res;
    }

    public Set<String> merge(Set<String> a, Set<String> b) {
        Set<String> res = new HashSet<>();

        for (String as : a) {
            for (String bs : b) {
                res.add(as + bs);
            }
        }

        return res;
    }

    public Set<String> merge(Set<String> a, String b) {
        Set<String> res = new HashSet<>();

        for (String as : a) {
            res.add(as + b);
        }

        return res;
    }
}
