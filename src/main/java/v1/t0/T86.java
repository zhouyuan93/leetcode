package v1.t0;

import common.ListNode;

public class T86 {

    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }
        ListNode less = null;

        ListNode before = null;
        ListNode p = head;
        if (p.val < x) {
            less = p;
            before = p;
            p = p.next;
        }
        while (p != null) {
            if (p.val < x) {
                if (less == null) {
                    less = p;
                    before.next = less.next;
                    less.next = head;
                    head = less;
                    p = before;
                }else{
                    before.next = p.next;
                    p.next = less.next;
                    less.next = p;
                    less = p;
                }
            }
            before = p;
            p = p.next;
        }

        return head;
    }

}
