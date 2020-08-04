package v1.t100;

import common.ListNode;

/**
 * @author yuan.zhou
 */
public class T141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow.val == fast.val) {
                return true;
            }
        }

        return false;
    }
}
