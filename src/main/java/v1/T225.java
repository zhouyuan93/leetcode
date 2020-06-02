package v1;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yuan.zhou
 */
public class T225 {
    class MyStack {

        Deque<Integer> queue;

        /** Initialize your data structure here. */
        public MyStack() {
            this.queue = new ArrayDeque<>();

        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.addLast(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return queue.removeLast();
        }

        /** Get the top element. */
        public int top() {
            return queue.peekLast();

        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
