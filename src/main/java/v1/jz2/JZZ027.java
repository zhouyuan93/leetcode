package v1.jz2;

import common.ListNode;

public class JZZ027 {
    public boolean isPalindrome(ListNode head) {

        ListNode p = head;
        ListNode q = head.next;

        ListNode t = new ListNode(-1);

        if (q == null) {
            return true;
        }

        while (q.next != null && q.next.next != null) {
            ListNode temp = p;
            p = p.next;
            q = q.next.next;
            temp.next = t;
            t = temp;
        }

        ListNode temp = p;
        if (q.next == null) {
            p = p.next;
        }else{
            p = p.next.next;
        }
        temp.next = t;
        t = temp;

        while (p != null) {
            if (p.val != t.val) {
                return false;
            }
            p = p.next;
            t = t.next;
        }

        return true;


    }
}
