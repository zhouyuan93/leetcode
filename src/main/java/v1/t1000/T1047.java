package v1.t1000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author yuan.zhou
 */
public class T1047 {
    public String removeDuplicates(String s) {
        Stack<Character> queue = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (queue.isEmpty()) {
                queue.add(c);
            }else{
                if (queue.peek() == c) {
                    queue.pop();
                }else{
                    queue.push(c);
                }
            }
        }

        StringBuilder res = new StringBuilder();
        while (!queue.isEmpty()) {
            res.append(queue.pop());
        }
        return res.reverse().toString();
    }
}
