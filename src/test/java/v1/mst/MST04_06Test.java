package v1.mst;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST04_06Test {

    MST04_06 t;

    @BeforeEach
    void setUp() {
        t = new MST04_06();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{2, 1, 3}, TreeTraversal.NLR);
        TreeNode p = root;
        TreeNode actual = t.inorderSuccessor(root, p);
        TreeNode expected = root.right;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5,3,6,2,4,null,null,1}, TreeTraversal.NLR);
        TreeNode p = root.right;
        TreeNode actual = t.inorderSuccessor(root, p);
        TreeNode expected = null;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5,3,6,2,4,null,null,1}, TreeTraversal.NLR);
        TreeNode p = root.left.left.left;
        TreeNode actual = t.inorderSuccessor(root, p);
        TreeNode expected =  root.left.left;
        assertEquals(expected,actual);
    }
}