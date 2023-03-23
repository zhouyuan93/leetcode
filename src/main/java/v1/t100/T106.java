package v1.t100;

import common.tree.TreeNode;

public class T106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public TreeNode buildTree(int[] inorder, int[] postorder, int il, int ir, int pl, int pr) {
        if (il > ir) {
            return null;
        }

        int x = postorder[pr];
        TreeNode t = new TreeNode(x);


        int mid = -1;
        for (int i = il; i <= ir; i++) {
            if (inorder[i] == x) {
                mid = i;
                break;
            }
        }

        t.left = buildTree(inorder, postorder, il, mid - 1, pl, pl + mid - il-1);
        t.right = buildTree(inorder, postorder, mid + 1, ir, pl + mid - il, pr - 1);

        return t;
    }
}
