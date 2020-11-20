package v1.t100;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T147Test {

    T147 t;

    @BeforeEach
    void setUp() {
        t = new T147();
    }

    @Test
    void test_1() {
        ListNode head = ListNode.initByArray(new int[]{4, 2, 1, 3});
        ListNode actual = t.insertionSortList(head);
        ListNode expected = ListNode.initByArray(new int[]{1, 2, 3, 4});
        ListNode.outPutString(expected);
        ListNode.outPutString(actual);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    void test_2() {
        ListNode head = ListNode.initByArray(new int[]{4, 2});
        ListNode actual = t.insertionSortList(head);
        ListNode expected = ListNode.initByArray(new int[]{2, 4});
        ListNode.outPutString(expected);
        ListNode.outPutString(actual);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    void test_3() {
        ListNode head = ListNode.initByArray(new int[]{2});
        ListNode actual = t.insertionSortList(head);
        ListNode expected = ListNode.initByArray(new int[]{2});
        ListNode.outPutString(expected);
        ListNode.outPutString(actual);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    void test_4() {
        ListNode head = ListNode.initByArray(new int[]{1, 1});
        ListNode actual = t.insertionSortList(head);
        ListNode expected = ListNode.initByArray(new int[]{1, 1});
        ListNode.outPutString(expected);
        ListNode.outPutString(actual);
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}