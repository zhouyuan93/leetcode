package v1.t400;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T404Test {

    T404 t;

    @BeforeEach
    void setUp() {
        t = new T404();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{3, 9, null, null, 20, 15, null, null, 7}, TreeTraversal.NLR);
        int actual = t.sumOfLeftLeaves(root);
        int expected = 24;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1,2,3,4,5}, TreeTraversal.NLR);
        int actual = t.sumOfLeftLeaves(root);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        TreeNode root = TreeNode.initByArray(new Integer[]{0,2,4,1,null,3,-1,5,1,null,6,null,8}, TreeTraversal.NLR);
        int actual = t.sumOfLeftLeaves(root);
        int expected = 5;
        assertEquals(expected,actual);
    }
}