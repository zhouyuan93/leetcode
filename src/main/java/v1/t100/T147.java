package v1.t100;

import common.ListNode;

/**
 * @author yuan.zhou
 */
public class T147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 有序链表最后一个节点
        ListNode last = head;
        while (last.next != null) {
            // 当前移动节点
            ListNode p = last.next;
            last.next = p.next;
            // 插入在第一个
            if (head.val > p.val) {
                p.next = head;
                head = p;
                continue;
            }
            // 插入在中间
            ListNode before = head;
            while(before != last){
                if (before.next.val > p.val) {
                    p.next = before.next;
                    before.next = p;
                    break;
                }
                before = before.next;
            }
            // 插入在最后
            if (last.val <= p.val) {
                p.next = last.next;
                last.next = p;
                last = p;
            }
        }

        return head;

    }
}
