package v1.t600;

import java.util.ArrayList;
import java.util.List;

public class T641 {
    class MyCircularDeque {


        private int[] elements;
        private int len;
        private int head;
        private int tail;

        public MyCircularDeque(int k) {
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

        public boolean insertFront(int value) {
            if (len == elements.length) {
                return false;
            }
            head = getBefore(head);
            elements[head] = value;
            len++;
            return true;
        }

        public boolean insertLast(int value) {
            if (len == elements.length) {
                return false;
            }
            tail = getNext(tail);
            elements[tail] = value;
            len++;
            return true;
        }

        public boolean deleteFront() {
            if (len == 0) {
                return false;
            }
            head = getNext(head);
            len--;
            return true;
        }

        public boolean deleteLast() {
            if (len == 0) {
                return false;
            }
            tail = getBefore(tail);
            len--;
            return true;
        }

        public int getFront() {
            if (len == 0) {
                return -1;
            }
            return elements[head];
        }

        public int getRear() {
            if (len == 0) {
                return -1;
            }
            return elements[tail];
        }

        public boolean isEmpty() {
            return len == 0;
        }

        public boolean isFull() {
            return len == elements.length;
        }
    }
}
