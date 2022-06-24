package v1.t2000;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2130Test {

    T2130 t = new T2130();

    @Test
    void test() {
        ListNode head = ListNode.initByArray(new int[]{5, 4, 2, 1});
        int actual = t.pairSum(head);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void test2() {
        ListNode head = ListNode.initByArray(new int[]{4, 2});
        int actual = t.pairSum(head);
        int expected = 6;
        assertEquals(expected,actual);
    }
}