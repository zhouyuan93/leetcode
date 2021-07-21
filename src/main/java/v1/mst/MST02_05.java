package v1.mst;

import common.ListNode;

public class MST02_05 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int upper = 0;

        ListNode res = new ListNode(0);
        ListNode p = res;

        while (l1 != null || l2 != null) {
            int x,y;
            if (l1 == null) {
                x = 0;
            }else{
                x = l1.val;
                l1 = l1.next;
            }

            if (l2 == null) {
                y = 0;
            }else{
                y= l2.val;
                l2 = l2.next;
            }

            int t = x + y + upper;
            if (t > 10) {
                upper= 1;
                res.next = new ListNode(t - 10);
            }else{
                upper = 0;
                res.next = new ListNode(t);
            }

            res = res.next;

        }

        if(upper == 1){
            res.next = new ListNode(1);
        }

        return p.next;

    }
}
