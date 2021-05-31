package v1.t1400;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1448Test {

    T1448 t;

    @BeforeEach
    void setUp() {
        t = new T1448();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{3, 1, 4, 3, null, 1, 5}, TreeTraversal.NLR);
        int actual = t.goodNodes(root);
        int expected = 4;
        assertEquals(expected,actual);
    }
}