package v1.jz;

import common.ListNode;

public class JZ52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;

        while (pa != null && pb != null) {
            pa = pa.next;
            pb = pb.next;
        }

        if (pa == null) {
            while (pb != null) {
                pb = pb.next;
                headB = headB.next;
            }
        }

        if (pb == null) {
            while (pa != null) {
                pa = pa.next;
                headA = headA.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;

    }
}
