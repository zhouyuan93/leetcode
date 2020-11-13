package v1.t300;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T328Test {

    T328 t;

    @BeforeEach
    void setUp() {
        t = new T328();
    }

    @Test
    void test_1() {
        ListNode head = ListNode.initByArray(new int[]{1, 2, 3, 4, 5});
        ListNode actual = t.oddEvenList(head);
        ListNode expected = ListNode.initByArray(new int[]{1, 3, 5, 2, 4});
        ListNode.outPutString(actual);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        ListNode head = ListNode.initByArray(new int[]{2, 1, 3, 5, 6, 4, 7});
        ListNode actual = t.oddEvenList(head);
        ListNode expected = ListNode.initByArray(new int[]{2, 3, 6, 7, 1, 5, 4});
        ListNode.outPutString(actual);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertEquals(expected, actual);
    }
}