package v1.t0;

import java.util.*;

public class T71 {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();

        Deque<String> res = new ArrayDeque<>();
        for (int i = 1; i <= path.length(); i++) {
            char c;

            if (i == path.length()) {
                c = '/';
            }else{
                c = path.charAt(i);
            }

            if (c == '/') {
                if (sb.length() == 0 || sb.toString().equals(".")) {
                } else if (sb.toString().equals("..")) {
                    if (!res.isEmpty()) {
                        res.pollLast();
                    }
                } else {
                    System.out.println(sb.toString());
                    res.add(sb.toString());
                }

                sb = new StringBuilder();
                continue;
            } else {
                sb.append(c);
            }
        }

        if (res.isEmpty()) {
            return "/";
        }


        sb = new StringBuilder();
        while (!res.isEmpty()) {
            sb.append("/").append(res.pollFirst());
        }
        return sb.toString();



    }
}
