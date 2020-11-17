package v1.t400;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.val == key && root.left == null && root.right == null) {
            return null;
        }
        TreeNode before = null;
        TreeNode head = root;
        while (root != null && root.val != key) {
            before = root;
            if (root.val > key) {
                root = root.left;
            }else{
                root = root.right;
            }
        }

        if (root == null) {
            return head;
        }

        TreeNode l = root.left;
        TreeNode r = root.right;
        if (l == null) {
            l = r;
        } else if (r == null) {
            l = l;
        } else {
            TreeNode t = l;
            while (t != null && t.right != null) {
                t = t.right;
            }
            t.right = r;
        }

        if (before == null) {
            return l;
        }

        if (before.left != null && before.left.val == key) {
            before.left = l;
        }else{
            before.right = l;
        }

        return head;
    }

}
