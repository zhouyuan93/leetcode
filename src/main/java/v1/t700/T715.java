package v1.t700;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 线段树
 */
public class T715 {
    static class RangeModule {

        public RangeModule() {

        }

        public void addRange(int left, int right) {
            update(root, 1, N, left, right-1, 1);
        }

        public boolean queryRange(int left, int right) {
            return query(root, 1, N, left, right-1);
        }

        public void removeRange(int left, int right) {
            update(root, 1, N, left, right-1, -1);
        }


        class Node {
            Node left, right;
            boolean cover;
            int add;
        }

        private int N = (int) 1e9;
        private Node root = new Node();

        private void pushUp(Node node) {
            node.cover = node.left.cover && node.right.cover;
        }

        private void pushDown(Node node, int leftNum, int rightNum) {
            if (node.left == null) {
                node.left = new Node();
            }
            if (node.right == null) {
                node.right = new Node();
            }
            if (node.add == 0) {
                return;
            }
            node.left.cover = node.add == 1;
            node.right.cover = node.add == 1;
            node.left.add = node.add;
            node.right.add = node.add;
            node.add = 0;
        }

        public void update(Node node, int start, int end, int l, int r, int val) {
            if (l <= start && end <= r) {
                node.cover = val == 1;
                node.add = val;
                return;
            }

            int mid = (start + end) >> 1;
            pushDown(node, mid - start + 1, end - mid);

            if (l <= mid) {
                update(node.left, start, mid, l, r, val);
            }
            if (r > mid) {
                update(node.right, mid + 1, end, l, r, val);
            }
            pushUp(node);
        }

        public boolean query(Node node, int start, int end, int l, int r) {
            if (l <= start && end <= r) {
                return node.cover;
            }

            int mid = (start + end) >> 1;
            pushDown(node, mid - start + 1, end - mid);

            boolean ans = true;
            if (l <= mid) {
                ans = ans && query(node.left, start, mid, l, r);
            }
            if (r > mid) {
                ans = ans && query(node.right, mid + 1, end, l, r);
            }
            return ans;
        }

    }

}
