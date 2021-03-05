package v1.t1400;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T1457 {
    public int pseudoPalindromicPaths(TreeNode root) {
        int[] nums = new int[10];
        pseudoPalindromicPaths(root, nums);
        return nums[0];
    }

    public void pseudoPalindromicPaths(TreeNode root, int[] nums) {
        if (root == null) {
            return;
        }
        nums[root.val]++;
        if (root.left == null && root.right == null) {
            boolean hasSingle = false;
            for (int i = 1 ; i < nums.length ; i++) {
                if (nums[i] % 2 == 1) {
                    if (hasSingle) {
                        nums[root.val]--;
                        return;
                    } else {
                        hasSingle = true;
                    }
                }
            }
            nums[0]++;
        }
        pseudoPalindromicPaths(root.left, nums);
        pseudoPalindromicPaths(root.right, nums);
        nums[root.val]--;
    }
}
