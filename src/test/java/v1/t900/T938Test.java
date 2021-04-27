package v1.t900;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T938Test {

    T938 t;

    @BeforeEach
    void setUp() {
        t = new T938();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{10, 5, 15, 3, 7, null, 18}, TreeTraversal.NLR);
        int actual = t.rangeSumBST(root, 7, 15);
        int expected = 32;
        assertEquals(expected, actual);
    }
}