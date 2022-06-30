package v1.jz2;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZZ027Test {

    JZZ027 t ;

    @BeforeEach
    void setUp() {
        t = new JZZ027();
    }

    @Test
    void test_1() {
        ListNode head = ListNode.initByArray(new int[]{1, 2, 3, 2, 1});
        boolean actual = t.isPalindrome(head);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        ListNode head = ListNode.initByArray(new int[]{1, 2, 2, 1});
        boolean actual = t.isPalindrome(head);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        ListNode head = ListNode.initByArray(new int[]{1, 3, 2, 1});
        boolean actual = t.isPalindrome(head);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}