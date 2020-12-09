package v1.t800;

import java.util.Stack;

/**
 * @author yuan.zhou
 */
public class T856 {
    public int scoreOfParentheses(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.add(-1);
            } else {
                Integer x = stack.pop();
                if (x == -1) {
                    int p = 1;
                    while (!stack.isEmpty() && stack.peek() != -1) {
                        p += stack.pop();
                    }
                    stack.push(p);
                } else {
                    while (!stack.isEmpty() && stack.peek() != -1) {
                        x += stack.pop();
                    }
                    x *= 2;
                    stack.pop();
                    stack.push(x);
                }
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

}
