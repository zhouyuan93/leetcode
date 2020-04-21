import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T111 {
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.right == null && root.left != null) {
            return 1 + minDepth(root.left);
        } else if(root.left == null && root.right != null){
            return 1 + minDepth(root.right);
        } else{
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }

    }
}
