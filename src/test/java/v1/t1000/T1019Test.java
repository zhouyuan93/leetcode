package v1.t1000;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1019Test {

    T1019 t;

    @BeforeEach
    void setUp() {
        t = new T1019();
    }

    @Test
    void test_1() {
        ListNode listNode = ListNode.initByArray(new int[]{2, 7, 4, 3, 5});
        int[] actual = t.nextLargerNodes(listNode);
        int[] expected = {7, 0, 5, 5, 0};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}