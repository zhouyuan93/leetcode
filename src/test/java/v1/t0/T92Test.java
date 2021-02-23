package v1.t0;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T92Test {

    T92 t;

    @BeforeEach
    void setUp() {
        t = new T92();
    }

    @Test
    void test_1() {
        ListNode head = ListNode.initByArray(new int[]{1, 2, 3, 4, 5});
        ListNode actual = t.reverseBetween(head, 2, 4);
        ListNode expected = ListNode.initByArray(new int[]{1, 4, 3, 2, 5});
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        ListNode head = ListNode.initByArray(new int[]{1, 2, 3, 4, 5});
        ListNode actual = t.reverseBetween(head, 2, 5);
        ListNode expected = ListNode.initByArray(new int[]{1,5, 4, 3, 2});
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertEquals(expected,actual);
    }


    @Test
    void test_3() {
        ListNode head = ListNode.initByArray(new int[]{1, 2, 3, 4, 5});
        ListNode actual = t.reverseBetween(head, 1, 5);
        ListNode expected = ListNode.initByArray(new int[]{5, 4, 3, 2, 1});
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        ListNode head = ListNode.initByArray(new int[]{1, 2});
        ListNode actual = t.reverseBetween(head, 1, 2);
        ListNode expected = ListNode.initByArray(new int[]{2,1});
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertEquals(expected,actual);
    }
}