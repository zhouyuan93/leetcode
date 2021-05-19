package v1.t600;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T623Test {

    T623 t;

    @BeforeEach
    void setUp() {
        t = new T623();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{4, 2, 6, 3, 1, 5}, TreeTraversal.NLR);
        int val = 1;
        int depth = 2;
        t.addOneRow(root, val, depth);
        TreeNode expected = TreeNode.initByArray(new Integer[]{4,1,1,2,null,null,6,3,1,5}, TreeTraversal.NLR);
        assertEquals(expected,root);
    }
}