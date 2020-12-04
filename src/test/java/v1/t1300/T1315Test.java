package v1.t1300;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1315Test {

    T1315 t;

    @BeforeEach
    void setUp() {
        t = new T1315();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{6, 7, 8, 2, 7, 1, 3, 9, null, 1, 4, null, null, null, 5}, TreeTraversal.NLR);
        int actual = t.sumEvenGrandparent(root);
        int expected = 18;
        assertEquals(expected, actual);
    }
}