package v1.jz;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ52Test {

    JZ52 t;

    @BeforeEach
    void setUp() {
        t = new JZ52();
    }

    @Test
    void test_1() {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(3);
        headA.next = headB;
        ListNode a = t.getIntersectionNode(headA, headB);
        assertEquals(headB, a);
    }
}