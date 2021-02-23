package v1.t0;

import common.ListNode;

/**
 * @author yuan.zhou
 */
public class T92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (right == left) {
            return head;
        }

        ListNode res = head;

        ListNode reverseList = null;
        ListNode end = null;

        int index = 0;
        while (head != null) {
            index++;

            if (left == index) {
                reverseList = head;
                head = head.next;
            } else if (left < index && index < right) {
                ListNode temp = head.next;
                head.next = reverseList;
                reverseList = head;
                head = temp;
            } else if (index == right) {
                ListNode temp = head.next;
                head.next = reverseList;
                reverseList = head;
                head = temp;

                if (end == null) {
                    res.next = head;
                    res = reverseList;
                }else{
                    end.next.next = head;
                    end.next = reverseList;
                }
                break;
            } else {
                end = head;
                head = head.next;
            }

        }

        return res;

    }
}
