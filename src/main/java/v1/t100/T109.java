package v1.t100;

import common.ListNode;
import common.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yuan.zhou
 */
public class T109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode p = head;
        ListNode mid = new ListNode(0);
        mid.next = head;
        while (p != null && p.next != null) {
            p = p.next.next;
            mid = mid.next;
        }
        TreeNode treeNode = new TreeNode(mid.next.val);
        treeNode.right = sortedListToBST(mid.next.next);
        mid.next = null;
        treeNode.left = sortedListToBST(head);

        return treeNode;

    }
}
