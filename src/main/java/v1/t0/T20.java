package v1.t0;

import java.util.Stack;

public class T20 {
    public static void main(String[] args) {
        String s = "";

        T20 t = new T20();

        System.out.println(t.isValid(s));

    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else{
                if (stack.empty() || stack.pop() != (c == ')' ? '(' : c == '}' ? '{' : '[')) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
