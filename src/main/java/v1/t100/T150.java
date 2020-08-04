package v1.t100;

import java.util.Stack;

public class T150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> queue = new Stack<>();

        Integer x = 0;
        Integer y = 0;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    x = queue.pop();
                    y = queue.pop();
                    queue.push(x + y);
                    break;
                case "-":
                    x = queue.pop();
                    y = queue.pop();
                    queue.push(y - x);
                    break;
                case "*":
                    x = queue.pop();
                    y = queue.pop();
                    queue.push(y * x);
                    break;
                case "/":
                    x = queue.pop();
                    y = queue.pop();
                    queue.push(y / x);
                    break;
                default:
                    queue.push(Integer.valueOf(s));
            }
        }
        return queue.pop();
    }
}
