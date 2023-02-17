package v1.t0;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T23Test {

    T23 t;

    @BeforeEach
    void setUp() {
        t = new T23();
    }

    @Test
    void test_1() {
        ListNode[] lists = {
                ListNode.initByArray(new int[]{1, 4, 5}),
                ListNode.initByArray(new int[]{1, 3, 4}),
                ListNode.initByArray(new int[]{2, 6})
        };
        ListNode actual = t.mergeKLists(lists);
        ListNode expected = ListNode.initByArray(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertEquals(ListNode.toString(expected), ListNode.toString(actual));
    }
}