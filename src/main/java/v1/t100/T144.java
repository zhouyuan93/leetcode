package v1.t100;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }

    public void preorder(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }
        list.add(treeNode.val);
        preorder(treeNode.left, list);
        preorder(treeNode.right, list);
    }
}
