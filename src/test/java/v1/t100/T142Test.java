package v1.t100;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T142Test {

    T142 t;

    @BeforeEach
    void setUp() {
        t = new T142();
    }

    @Test
    void test_1() {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l0 = new ListNode(0);
        ListNode l4 = new ListNode(4);
        l3.next = l2;
        l2.next = l0;
        l0.next = l4;
        l4.next = l2;

        ListNode actual = t.detectCycle(l3);

        assertEquals(l2.val, actual.val);
    }

    @Test
    void test_2() {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l0 = new ListNode(0);
        ListNode l4 = new ListNode(4);
        l3.next = l2;
        l2.next = l0;
        l0.next = l4;
        l4.next = l3;

        ListNode actual = t.detectCycle(l3);

        assertEquals(l3.val, actual.val);
    }
}