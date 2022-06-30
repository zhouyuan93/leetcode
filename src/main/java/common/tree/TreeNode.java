package common.tree;

import java.util.ArrayList;
import java.util.List;

import static common.tree.TreeTraversal.NLR;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode initByArray(Integer[] nums) {
        return initByArray(nums,NLR);
    }

    public static TreeNode initByArray(Integer[] nums, TreeTraversal type) {
        switch (type) {
            case LNR:
                throw new IllegalArgumentException("no LNR method");
            case LRN:
                throw new IllegalArgumentException("no LRN method");
            case NLR:
                return initByArrayNLP(nums);
        }
        return null;
    }

    private static TreeNode initByArrayNLP(Integer[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("nums can't trans to TreeNode");
        }
        TreeNode root = new TreeNode(nums[0]);
        int i = 1;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);

        while (i < nums.length) {
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode treeNode: list) {
                Integer left = i < nums.length ? nums[i++] : null;
                Integer right = i < nums.length ? nums[i++] : null;
                if (left != null) {
                    TreeNode t = new TreeNode(left);
                    temp.add(t);
                    treeNode.left = t;
                }
                if (right != null) {
                    TreeNode t = new TreeNode(right);
                    temp.add(t);
                    treeNode.right = t;
                }
            }
            list = temp;
        }
        return root;
    }

    @Override
    public String toString() {
        return val
                + "["
                + (left == null ? "null " : left.toString())
                + ","
                + (right == null ? "null " : right.toString())
                + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TreeNode) {
            TreeNode objTree = (TreeNode) obj;
            if (this.left == null && null != objTree.left) {
                return false;
            }
            if (this.right == null && null != objTree.right) {
                return false;
            }
            return this.val == objTree.val
                    && (this.left == null || this.left.equals(objTree.left))
                    && (this.right == null || this.right.equals(objTree.right));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}


