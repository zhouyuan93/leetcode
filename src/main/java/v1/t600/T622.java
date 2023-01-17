package v1.t600;

public class T622 {
    class MyCircularQueue {

        private int[] elements;
        private int len;
        private int head;
        private int tail;

        public MyCircularQueue(int k) {
            elements = new int[k];
            len = 0;
            head = 1;
            tail = 0;
        }

        private int getBefore(int x) {
            x--;
            if (x < 0) {
                x += elements.length;
            }
            return x;
        }

        private int getNext(int x) {
            x++;
            if (x >= elements.length) {
                x -= elements.length;
            }
            return x;
        }

        public boolean enQueue(int value) {
            if (len == elements.length) {
                return false;
            }
            head = getBefore(head);
            elements[head] = value;
            len++;
            return true;
        }

        public boolean deQueue() {
            if (len == 0) {
                return false;
            }
            tail = getBefore(tail);
            len--;
            return true;
        }

        public int Front() {
            if (len == 0) {
                return -1;
            }
            return elements[tail];
        }

        public int Rear() {
            if (len == 0) {
                return -1;
            }
            return elements[head];
        }

        public boolean isEmpty() {
            return len == 0;
        }

        public boolean isFull() {
            return len == elements.length;
        }
    }
}
