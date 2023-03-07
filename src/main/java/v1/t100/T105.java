package v1.t100;

import common.tree.TreeNode;

public class T105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);

    }

    public TreeNode build(int[] preorder, int[] inorder, int pl, int pr, int rl, int rr) {
        if (pl > pr) {
            return null;
        }
        int x = preorder[pl];

        TreeNode node = new TreeNode(x);

        if (pl == pr) {
            return node;
        }

        for (int i = rl; i <= rr; i++) {
            if (inorder[i] == x) {
                int len = i-rl;
                node.left = build(preorder, inorder, pl + 1, pl +len, rl, i - 1);
                node.right = build(preorder, inorder, pl + len + 1, pr, i + 1, rr);
            }
        }

        return node;

    }
}
