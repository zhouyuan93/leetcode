package v1;

import common.ListNode;

/**
 * @author yuan.zhou
 */
public class T237 {
    public void deleteNode(ListNode node) {
        //将删除节点val变更成下一个val
        node.val = node.next.val;

        //将删除节点next变更为下一个节点的next
        node.next = node.next.next;

    }
}
