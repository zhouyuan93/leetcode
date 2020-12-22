package v1.t1300;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1302Test {

    T1302 t;

    @BeforeEach
    void setUp() {
        t = new T1302();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, 8}, TreeTraversal.NLR);
        int actual = t.deepestLeavesSum(root);
        int expected = 15;
        assertEquals(expected, actual);
    }
}