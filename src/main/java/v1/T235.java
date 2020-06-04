package v1;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (q.val < p.val) {
            TreeNode temp = p;
            p = q;
            q = temp;
        }


        while (root != null) {
            if (root.val < p.val) {
                root = root.right;
            }else if(root.val > q.val){
                root = root.left;
            }else{
                return root;
            }
        }

        return root;

    }
}
