package v1.t200;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
            return res;
        }

        StringBuilder leftHead = new StringBuilder();
        leftHead.append(root.val);

        StringBuilder rightHead = new StringBuilder();
        rightHead.append(root.val);


        binaryTreePaths(root.left, leftHead, res);
        binaryTreePaths(root.right, rightHead, res);

        return res;

    }

    public void binaryTreePaths(TreeNode root, StringBuilder head, List<String> res) {
        if (root == null) {
            return;
        }
        head.append("->");
        head.append(root.val);
        if (root.left == null && root.right == null) {
            res.add(head.toString());
            return;
        }

        StringBuilder leftHead = head;
        StringBuilder rightHead;
        if (root.left != null && root.right != null) {
            rightHead = new StringBuilder(head.toString());
        }else{
            rightHead = head;
        }

        binaryTreePaths(root.left, leftHead, res);
        binaryTreePaths(root.right, rightHead, res);
    }
}
