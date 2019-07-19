package common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode initByArray(int[] nums) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int i : nums) {
            p.next = new ListNode(i);
            p = p.next;
        }
        return head.next;
    }

    public static void outPutString(ListNode head) {
        ListNode p = head;
        StringBuilder s = new StringBuilder();
        while (p != null) {
            s.append("->" + p.val);
            p = p.next;
        }
        System.out.println(s);
    }
}
