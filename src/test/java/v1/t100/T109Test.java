package v1.t100;

import common.ListNode;
import common.tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T109Test {
    T109 t;

    @BeforeEach
    void setUp() {
        t = new T109();
    }

    @Test
    void test_1() {
        ListNode head = ListNode.initByArray(new int[]{-10, -3, 0, 5, 9});
        TreeNode actual = t.sortedListToBST(head);
        assertEquals("0[-3[-10[null ,null ],null ],9[5[null ,null ],null ]]",actual.toString());
    }
}