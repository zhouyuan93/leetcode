package v1.t1900;

import common.tree.TreeNode;

import java.util.List;

public class T1932 {
    int count;

    public TreeNode canMerge(List<TreeNode> trees) {
        int[] roots = new int[50001];
        int[] children = new int[50001];

        count = trees.size();

        for (int i = 1; i <= trees.size(); i++) {
            TreeNode node = trees.get(i - 1);
            if (roots[node.val] > 0) {
                return null;
            }
            roots[node.val] = i;
            if (node.left != null) {
                if (children[node.left.val] > 0) {
                    return null;
                }
                children[node.left.val] = i;
            }
            if (node.right != null) {
                if (children[node.right.val] > 0) {
                    return null;
                }
                children[node.right.val] = i;
            }
        }

        int rootIndex = -1;
        for (int i = 0; i < trees.size(); i++) {
            TreeNode node = trees.get(i);
            if (children[node.val] == 0) {
                if (rootIndex == -1) {
                    rootIndex = i;
                } else {
                    return null;
                }
            }
        }

        if (rootIndex == -1) {
            return null;
        }

        TreeNode root = trees.get(rootIndex);
        count--;

        if (!detail(root.left, Integer.MIN_VALUE, root.val, roots, trees)) {
            return null;
        }
        if (!detail(root.right, root.val, Integer.MAX_VALUE, roots, trees)) {
            return null;
        }

        if (count > 0) {
            return null;
        }

        return root;
    }

    private boolean detail(TreeNode node, int l, int r, int[] roots, List<TreeNode> trees) {
        if (node == null) {
            return true;
        }


        if (roots[node.val] > 0) {
            count--;
            TreeNode child = trees.get(roots[node.val] - 1);

            if (child.right != null && child.right.val > r) {
                return false;
            }

            if (child.left != null && child.left.val < l) {
                return false;
            }

            if (!detail(child.left, l, child.val, roots, trees)) {
                return false;
            }
            if (!detail(child.right, child.val, r, roots, trees)) {
                return false;
            }
            node.left = child.left;
            node.right = child.right;
        }
        return true;
    }



}
