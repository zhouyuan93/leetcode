package v1.t0;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T82Test {

    T82 t;

    @BeforeEach
    void setUp() {
        t = new T82();
    }

    @Test
    void test_1() {
        ListNode head = ListNode.initByArray(new int[]{1, 1, 2, 2, 3, 4, 5});
        ListNode actual = t.deleteDuplicates(head);
        ListNode expected = ListNode.initByArray(new int[]{3, 4, 5});
        assertEquals(ListNode.toString(expected),ListNode.toString(actual));
    }

    @Test
    void test_2() {
        ListNode head = ListNode.initByArray(new int[]{1, 1, 2, 2, 3, 4, 5,6,6,6});
        ListNode actual = t.deleteDuplicates(head);
        ListNode expected = ListNode.initByArray(new int[]{3, 4, 5});
        assertEquals(ListNode.toString(expected),ListNode.toString(actual));
    }
}