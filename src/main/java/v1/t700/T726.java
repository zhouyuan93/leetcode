package v1.t700;

import java.security.Key;
import java.util.*;

public class T726 {
    public String countOfAtoms(String formula) {
        int len = formula.length();

        int x = 1;

        Stack<Integer> queue = new Stack<>();
        queue.add(1);

        HashMap<String, Integer> map = new HashMap<>();

        boolean hasC = false;
        char b = ' ';
        char t = ' ';
        for (int i = len - 1; i >= 0; i--) {
            char c = formula.charAt(i);

            b = t;
            t = c;
            if(c == ')'){
                if (b < '0' || b > '9') {
                    queue.push(1);
                }
                continue;
            }

            if (c == '(') {
                x /= queue.pop();
                continue;
            }

            if (c >= '0' && c <= '9') {
                int y = 0;
                int l = 1;
                while (c >= '0' && c <= '9') {
                    y += (l * (c - '0'));

                    l *= 10;
                    c = formula.charAt(--i);
                }
                queue.add(y);
                x *= y;

                i++;

                continue;
            }

            if (c >= 'a' && c <= 'z') {
                boolean hasNum = b >= '0' && b <= '9';

                StringBuilder sb = new StringBuilder();
                while (c >= 'a' && c <= 'z') {
                    sb.append(c);
                    c = formula.charAt(--i);
                }
                sb.append(c);
                String key = sb.reverse().toString();
                map.put(key, map.getOrDefault(key, 0) + x);

                if (hasNum) {
                    x /= queue.pop();
                }
                continue;
            }

            if (c >= 'A' && c <= 'Z') {
                boolean hasNum = b >= '0' && b <= '9';

                String key = String.valueOf(c);
                map.put(key, map.getOrDefault(key, 0) + x);

                if (hasNum) {
                    x /= queue.pop();
                }
                continue;
            }

        }

        StringBuilder res = new StringBuilder();
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(
                entry ->{
                    res.append(entry.getKey());
                    int val = entry.getValue();
                    if (val > 1) {
                        res.append(entry.getValue());
                    }
                }
        );

        return res.toString();
    }
}
