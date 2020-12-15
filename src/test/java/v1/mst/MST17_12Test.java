package v1.mst;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST17_12Test {

    MST17_12 t;

    @BeforeEach
    void setUp() {
        t = new MST17_12();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{4, 2, 5, 1, 3, null, 6, 0}, TreeTraversal.NLR);
        TreeNode actual = t.convertBiNode(root);
        TreeNode expected = TreeNode.initByArray(new Integer[]{0, null, 1, null, 2, null, 3, null, 4, null, 5, null, 6}, TreeTraversal.NLR);
        assertEquals(expected, actual);
    }
}