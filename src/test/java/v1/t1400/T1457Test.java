package v1.t1400;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1457Test {

    T1457 t;

    @BeforeEach
    void setUp() {
        t = new T1457();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{2, 3, 1, 3, 1, null, 1}, TreeTraversal.NLR);
        int actual = t.pseudoPalindromicPaths(root);
        int expected = 2;
        assertEquals(expected,actual);
    }
}