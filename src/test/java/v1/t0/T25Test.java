package v1.t0;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T25Test {

    T25 t;

    @BeforeEach
    void setUp() {
        t = new T25();
    }

    @Test
    void test_1() {
        ListNode head = ListNode.initByArray(new int[]{1, 2, 3, 4, 5});
        int k = 3;
        ListNode actual = t.reverseKGroup(head, k);
        ListNode expected = ListNode.initByArray(new int[]{3, 2, 1, 4, 5});
        assertEquals(ListNode.toString(expected), ListNode.toString(actual));

    }
}