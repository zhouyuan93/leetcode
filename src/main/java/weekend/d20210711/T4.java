package weekend.d20210711;

import common.tree.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T4 {
    TreeNode[] memo = new TreeNode[50000];
    TreeNode[] left = new TreeNode[50000];
    TreeNode[] right = new TreeNode[50000];

    boolean res = true;
    public TreeNode canMerge(List<TreeNode> trees) {
        int count = trees.size();

        for (TreeNode tree : trees) {
            memo[tree.val] = tree;
            if (tree.left != null) {
                memo[tree.left.val] = tree;
            }
            if (tree.right != null) {
                memo[tree.right.val] = tree;
            }
        }



        Queue<TreeNode> queue = new LinkedList<>();

        return null;
    }



}
