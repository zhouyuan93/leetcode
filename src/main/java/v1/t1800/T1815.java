package v1.t1800;

public class T1815 {
    class TreeNode {
        TreeNode left, right;
        int val;
        int add;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static final int N = (int) 1e7;

    public int[] minInterval(int[][] intervals, int[] queries) {
        TreeNode node = new TreeNode(Integer.MAX_VALUE);

        for (int[] interval : intervals) {
            update(node, 1, N, interval[0], interval[1], interval[1] - interval[0] + 1);
        }

        for (int i = 0; i < queries.length; i++) {
            queries[i] = query(node, 1, N, queries[i], queries[i]);
            if (queries[i] == Integer.MAX_VALUE) {
                queries[i] = -1;
            }
        }

        return queries;

    }

    public void pushUp() {

    }

    public void pushDown(TreeNode node) {
        if (node.left == null) {
            node.left = new TreeNode(node.val);
        }
        if (node.right == null) {
            node.right = new TreeNode(node.val);
        }
        if (node.add == 0) {
            return;
        }
        if (node.left.val > node.val) {
            node.left.val = node.val;
            node.left.add = 1;
        }
        if (node.right.val > node.val) {
            node.right.val = node.val;
            node.right.add = 1;
        }
        node.add = 0;
    }

    public void update(TreeNode node, int start, int end, int left, int right, int val) {
        if (left <= start && end <= right) {
            if (node.val != -1 && node.val > val) {
                node.val = val;
                node.add = 1;
            }
            return;
        }
        pushDown(node);

        int mid = (start + end) >> 1;
        if (left <= mid) {
            update(node.left, start, mid, left, right, val);
        }
        if (mid < right) {
            update(node.right, mid+1, end, left, right, val);
        }
    }

    public int query(TreeNode node, int start, int end, int left, int right) {
        if (left <= start && end <= right) {
            return node.val;
        }

        pushDown(node);

        int mid = (start + end) >> 1;
        int ans = Integer.MAX_VALUE;
        if (left <= mid) {
            int t = query(node.left, start, mid, left, right);
            ans = Math.min(ans, t);
        }
        if (mid < right) {
            int t =query(node.right, mid+1, end, left, right);
            ans = Math.min(ans, t);
        }
        return ans;
    }

}
