package v1.t1300;

import common.tree.TreeNode;

import java.util.Optional;

/**
 * @author yuan.zhou
 * 应该直接内存地址比较
 */
public class T1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return getTargetCopy(cloned, target);
    }

    public final TreeNode getTargetCopy(TreeNode cloned, TreeNode target) {
        if (cloned == null) {
            return null;
        }

        if (isEqualPoint(cloned, target)) {
            return cloned;
        }

        TreeNode copy = getTargetCopy(cloned.right, target);
        if (copy != null) {
            return copy;
        }

        copy = getTargetCopy(cloned.left, target);
        if (copy != null) {
            return copy;
        }

        return null;

    }

    public boolean isEqualPoint(TreeNode original, TreeNode target) {
        if (original == null) {
            if (target == null) {
                return true;
            }else{
                return false;
            }
        }
        if (original.val != target.val) {
            return false;
        }
        if (!isEqualPoint(original.left, target.left)) {
            return false;
        }
        if (!isEqualPoint(original.right, target.right)) {
            return false;
        }
        return true;
    }
}
