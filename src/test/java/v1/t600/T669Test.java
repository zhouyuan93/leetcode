package v1.t600;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T669Test {

    T669 t;

    @BeforeEach
    void setUp() {
        t = new T669();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 0, 2}, TreeTraversal.NLR);
        int low = 1;
        int high = 2;
        TreeNode actual = t.trimBST(root, low, high);
        TreeNode expected = TreeNode.initByArray(new Integer[]{1, null, 2}, TreeTraversal.NLR);
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{3,0,4,null,2,null,null,1}, TreeTraversal.NLR);
        int low = 1;
        int high = 3;
        TreeNode actual = t.trimBST(root, low, high);
        TreeNode expected = TreeNode.initByArray(new Integer[]{3,2,null,1}, TreeTraversal.NLR);
        assertEquals(expected, actual);
    }
}