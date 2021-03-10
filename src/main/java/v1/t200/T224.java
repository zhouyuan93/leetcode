package v1.t200;

import java.util.Stack;

/**
 * @author yuan.zhou
 */
public class T224 {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Stack<Func> stack = new Stack<>();
        int x = 0;
        boolean isAdd = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            } else if (c == '(') {
                Func func = new Func(x, isAdd);
                stack.push(func);
                x = 0;
                isAdd = true;
            } else if (c == ')') {
                Func func = stack.pop();
                x = func.val + (func.isAdd ? 1 : -1) * x;
            } else if (c <= '9' && c >= '0') {
                int y = c - '0';
                while (i + 1 < s.length()) {
                    c = s.charAt(i + 1);
                    if (c <= '9' && c >= '0') {
                        y = y * 10 + (c - '0');
                        i++;
                    }else {
                        break;
                    }
                }
                x = x + (isAdd ? 1 : -1) * y;
            } else {
                isAdd = c == '+';
            }

        }

        return x;

    }

    public static class Func {
        int val;
        boolean isAdd;

        public Func(int val, boolean isAdd) {
            this.val = val;
            this.isAdd = isAdd;
        }
    }
}
