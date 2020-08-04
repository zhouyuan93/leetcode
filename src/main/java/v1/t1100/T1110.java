package v1.t1100;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T1110 {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Arrays.sort(to_delete);

        boolean isContainNode = containNode(to_delete, root);

        List<TreeNode> res = delNodesAdd(root, to_delete, true,isContainNode);

        return res;
    }

    public List<TreeNode> delNodesAdd(TreeNode treeNode, int[] toDeleteSorted, boolean isAdd, boolean isContainNode) {
        if (treeNode == null) {
            return new ArrayList<>();
        }
        List<TreeNode> res = new ArrayList<>();
        List<TreeNode> resLeft;
        List<TreeNode> resRight;

        TreeNode treeNodeLeft = treeNode.left;
        TreeNode treeNodeRight = treeNode.right;
        boolean isContainLeft = containNode(toDeleteSorted, treeNodeLeft);
        boolean isContainRight = containNode(toDeleteSorted, treeNodeRight);

        if(isAdd && !isContainNode){
            res.add(treeNode);
        }
        if(isContainLeft){
            treeNode.left = null;
        }
        if (isContainRight) {
            treeNode.right = null;
        }

        resLeft = delNodesAdd(treeNodeLeft, toDeleteSorted, isContainNode,isContainLeft);
        resRight = delNodesAdd(treeNodeRight, toDeleteSorted, isContainNode,isContainRight);
        res.addAll(resLeft);
        res.addAll(resRight);

        return res;
    }

    public boolean containNode(int[] toDeleteSorted, TreeNode treeNode) {
        if (treeNode == null) {
            return false;
        }
        return Arrays.binarySearch(toDeleteSorted, treeNode.val)>=0;
    }
}
