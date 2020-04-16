package v1;

import common.ListNode;

/**
 * @author yuan.zhou
 */
public class T83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head;
        ListNode beforeP = null;
        while (p != null && p.next != null) {
            beforeP = p;
            p = p.next;
            while (beforeP.val == p.val) {
                beforeP.next = p.next;
                p = p.next;
                if (p == null) {
                    break;
                }
            }
        }
        return head;
    }
}
