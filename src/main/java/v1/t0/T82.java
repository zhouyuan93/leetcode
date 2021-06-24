package v1.t0;

import common.ListNode;

public class T82 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;

        ListNode p = res;
        while (head != null) {
            boolean isSame = false;
            ListNode n = head.next;
            while (n != null) {
                if (n.val != head.val) {
                    break;
                }
                isSame = true;
                n = n.next;
            }
            if (isSame) {
                p.next = n;
                head = n;
            }else{
                p = head;
                head = head.next;
            }
        }

        return res.next;
    }

}
