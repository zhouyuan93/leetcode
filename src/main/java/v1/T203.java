package v1;

import common.ListNode;

/**
 * @author yuan.zhou
 */
public class T203 {
    public ListNode removeElements(ListNode head, int val) {
        //先处理head.val = val
        while (head != null && head.val == val) {
            head = head.next;
        }
        //再处理中间val
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}
