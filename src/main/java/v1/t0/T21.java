package v1.t0;

import common.ListNode;

public class T21 {
    public static void main(String[] args) {
        ListNode l1 = ListNode.initByArray(new int[]{1, 3, 5, 7, 8});
        ListNode l2 = ListNode.initByArray(new int[]{2, 4, 6, 9});

        T21 t = new T21();
        ListNode l = t.mergeTwoLists(l1, l2);
        ListNode.outPutString(l);

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = res;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        p.next = l1 != null ? l1 : l2;
        return res.next;
    }
}
