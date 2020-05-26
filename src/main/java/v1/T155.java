package v1;

import java.util.LinkedHashMap;

public class T155 {
    class MinStack {

        /** initialize your data structure here. */
        LinkedList head;
        MinStack() {
            this.head = null;
        }

        void push(int x) {
            LinkedList node = new LinkedList(x);
            if (head == null) {
                node.min = x;
                head = node;
                return;
            }

            node.min = Math.min(x, head.min);
            node.next = head;

            head = node;
        }

        void pop() {
            if (head == null) {
                return;
            }
            head = head.next;
        }

        int top() {
            if (head == null) {
                return -1;
            }
            return head.val;
        }

        int getMin() {
            if (head == null) {
                return -1;
            }
            return head.min;
        }

        public class LinkedList{
            public int val;
            public LinkedList next;
            public int min;

            public LinkedList(int val) {
                this.val = val;
            }

        }
    }
}
