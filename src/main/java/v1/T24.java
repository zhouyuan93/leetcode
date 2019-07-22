package v1;

import common.ListNode;

public class T24 {
    public static void main(String[] args) {
        ListNode head = ListNode.initByArray(new int[]{1, 2, 3, 4, 5, 6});

        T24 t = new T24();
        ListNode res = t.swapPairs(head);
        ListNode.outPutString(res);

    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = new ListNode(0);
        ListNode p = res;
        ListNode temp = null;
        while (head != null) {
            if (temp == null) {
                temp = head;
                head = head.next;
            }else{
                p.next = head;
                p = p.next;
                head = head.next;
                p.next = temp;
                p = p.next;
                temp = null;
            }
        }
        if (temp != null) {
            p.next = temp;
            p = p.next;
        }
        p.next = null;
        return res.next;
    }
}
