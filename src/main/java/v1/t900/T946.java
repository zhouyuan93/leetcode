package v1.t900;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author yuan.zhou
 */
public class T946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0 && popped.length == 0) {
            return true;
        }

        if (popped.length > pushed.length) {
            return false;
        }

        Stack<Integer> stack = new Stack<>();

        int x = 1;
        int y = 0;
        stack.push(pushed[0]);

        while (x < pushed.length && y < popped.length) {
            if (!stack.isEmpty() && stack.peek() == popped[y]) {
                stack.pop();
                y++;
            }else{
                stack.push(pushed[x]);
                x++;
            }
        }

        while (y < popped.length) {
            if (stack.pop() != popped[y++]) {
                return false;
            }
        }

        return true;
    }
}
