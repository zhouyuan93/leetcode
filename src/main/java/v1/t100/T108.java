package v1.t100;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int begin, int end) {
        if (begin == end) {
            return new TreeNode(nums[end]);
        } else if (end - begin == 1) {
            TreeNode head = new TreeNode(nums[end]);
            head.left = new TreeNode(nums[begin]);
            return head;
        } else {
            int mid = (begin + end) / 2;
            TreeNode head = new TreeNode(nums[mid]);
            head.left = sortedArrayToBST(nums, begin, mid - 1);
            head.right = sortedArrayToBST(nums, mid + 1, end);
            return head;
        }
    }
}
