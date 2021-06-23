package v1.t0;

import common.ListNode;
import common.tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T86Test {

    T86 t;

    @BeforeEach
    void setUp() {
        t = new T86();
    }

    @Test
    void test_1() {
        ListNode head = ListNode.initByArray(new int[]{1, 4, 3, 2, 5, 2});
        int x = 3;
        ListNode actual = t.partition(head, x);
        ListNode expected = ListNode.initByArray(new int[]{1, 2, 2, 4, 3, 5});
        assertEquals(ListNode.toString(expected),ListNode.toString(actual));
    }

    @Test
    void test_2() {
        ListNode head = ListNode.initByArray(new int[]{2,1});
        int x = 2;
        ListNode actual = t.partition(head, x);
        ListNode expected = ListNode.initByArray(new int[]{1,2});
        assertEquals(ListNode.toString(expected),ListNode.toString(actual));
    }

    @Test
    void test_3() {
        ListNode head = ListNode.initByArray(new int[]{1,1});
        int x = 2;
        ListNode actual = t.partition(head, x);
        ListNode expected = ListNode.initByArray(new int[]{1,1});
        assertEquals(ListNode.toString(expected),ListNode.toString(actual));
    }
}