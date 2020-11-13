package v1.t300;

import common.ListNode;

/**
 * @author yuan.zhou
 */
public class T328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }


        ListNode oddNum = head;
        ListNode evenNum = head.next;

        ListNode p;
        p = head.next.next;
        boolean isOdd = true;

        while (p != null) {
            if (isOdd) {
                evenNum.next = p.next;
                p.next = oddNum.next;
                oddNum.next = p;

                oddNum = oddNum.next;
                p = evenNum.next;
            }else{
                evenNum = p;
                p = p.next;
            }
            isOdd = !isOdd;
        }

        return head;
    }
}
