package v1.t100;

import common.ListNode;

public class T160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLen = 0;
        int bLen = 0;

        ListNode p = headA;
        while (p != null) {
            p = p.next;
            aLen++;
        }
        p = headB;
        while (p != null) {
            p = p.next;
            bLen++;
        }


        ListNode pB = headB;
        ListNode pA = headA;
        while (aLen > bLen) {
            pA = pA.next;
            aLen--;
        }
        while (bLen > aLen) {
            pB = pB.next;
            bLen--;
        }

        while (pA != null) {
            if (pA == pB) {
                return pA;
            }
            pA = pA.next;
            pB = pB.next;
        }

        return null;

    }
}
