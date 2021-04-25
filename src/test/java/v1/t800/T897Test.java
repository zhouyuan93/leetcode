package v1.t800;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T897Test {
    T897 t;

    @BeforeEach
    void setUp() {
        t = new T897();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5, 3, 6, 2, 4, null, 8, 1, null,
                null, null, 7, 9}, TreeTraversal.NLR);
        TreeNode actual = t.increasingBST(root);
        TreeNode expected = TreeNode.initByArray(new Integer[]{1, null, 2, null, 3, null, 4, null, 5,
                null, 6, null, 7, null, 8, null, 9}, TreeTraversal.NLR);
        assertEquals(expected.toString(), actual.toString());
    }
}