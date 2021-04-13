package v1.t700;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T783Test {

    T783 t;

    @BeforeEach
    void setUp() {
        t = new T783();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[] {1,0,48,null,null,12,49},TreeTraversal.NLR);
        int actual = t.minDiffInBST(root);
        int expected = 1;
        assertEquals(expected, actual);
    }
}