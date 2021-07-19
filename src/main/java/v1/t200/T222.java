package v1.t200;

import common.tree.TreeNode;

public class T222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = 0;
        TreeNode p = root;
        while (p != null) {
            p = p.left;
            l++;
        }

        int r = 0;
        p = root;
        while (p != null) {
            p = p.right;
            r++;
        }

        if (l == r) {
            return (int) (Math.pow(2, l) - 1);
        }

        int left = (int) Math.pow(2, l - 1);
        int right = (int) Math.pow(2, l) - 1;
        while (left < right - 1) {
            int mid = (left + right) / 2;
            if (isExists(root, mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private boolean isExists(TreeNode root, int val) {
        String s = Integer.toBinaryString(val);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root != null;
    }
}
