package v1.t600;

import common.tree.TreeNode;

public class T687 {

    int res = 0;

    public int longestUnivaluePath(TreeNode root) {

        longest(root, 0);

        return res;

    }

    public int longest(TreeNode root, int len) {

        int left = 0;
        boolean isEqualLeft = false;
        if (root.left != null) {
            int t = 0;
            if (root.val == root.left.val) {
                isEqualLeft = true;
                t = len+1;
            }
            left = longest(root.left, t);
        }

        int right = 0;
        boolean isEqualRight = false;
        if (root.right != null) {
            int t = 0;
            if (root.val == root.right.val) {
                isEqualRight = true;
                t = len + 1;
            }
            right = longest(root.right, t);
        }

        if (!isEqualLeft) {
            left = 0;
        }else{
            left++;
        }
        if (!isEqualRight) {
            right = 0;
        }else{
            right++;
        }

        int tempRes = left + right + len - Math.min(Math.min(left, right), len);
        if (res < tempRes) {
            res = tempRes;
        }

        return Math.max(left, right);

    }
}
