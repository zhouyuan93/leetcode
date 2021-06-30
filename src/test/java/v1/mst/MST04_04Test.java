package v1.mst;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST04_04Test {

    MST04_04 t;

    @BeforeEach
    void setUp() {
        t = new MST04_04();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4}, TreeTraversal.NLR);
        boolean actual = t.isBalanced(root);
        boolean expected = false;
        assertEquals(expected,actual);
    }
}