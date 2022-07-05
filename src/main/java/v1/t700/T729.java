package v1.t700;

/**
 * 线段树
 */
public class T729 {
    static class MyCalendar {

        class Node {
            Node left;
            Node right;
            boolean isBook;
            int add;
        }

        private Node root;

        public MyCalendar() {
            root = new Node();
        }

        public static final int N = (int) 1e9;

        public boolean book(int start, int end) {
            if (query(root, 0, N, start, end - 1)) {
                return false;
            }

            update(root, 0, N, start, end - 1);
            return true;
        }

        private boolean query(Node node, int start, int end, int l, int r) {
            if (l <= start && end <= r) {
                return node.isBook;
            }
            int mid = (start + end) >> 1;

            pushDown(node);

            boolean res = false;
            if (l <= mid) {
                res = res || query(node.left, start, mid, l, r);
            }
            if (r > mid) {
                res = res || query(node.right, mid + 1, end, l, r);
            }
            return res;
        }

        private void pushUp(Node node) {
            node.isBook = node.left.isBook || node.right.isBook;
        }

        private void pushDown(Node node) {
            if (node.left == null) {
                node.left = new Node();
            }

            if (node.right == null) {
                node.right = new Node();
            }

            if (node.add == 1) {
                node.left.isBook = node.isBook;
                node.right.isBook = node.isBook;
                node.left.add = 1;
                node.right.add = 1;
                node.add = 0;
            }

        }

        private void update(Node node, int start, int end, int l, int r) {
            if (l <= start && end <= r) {
                node.isBook = true;
                node.add = 1;
                return;
            }
            int mid = (start + end) >> 1;

            pushDown(node);

            if (l <= mid) {
                update(node.left, start, mid, l, r);
            }
            if (r > mid) {
                update(node.right, mid + 1, end, l, r);
            }

            pushUp(node);

        }
    }
}
