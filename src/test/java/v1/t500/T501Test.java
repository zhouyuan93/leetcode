package v1.t500;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.Test;
import v1.t500.T501;

import static org.junit.jupiter.api.Assertions.*;

class T501Test {
    T501 t = new T501();

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, null, 2, 2}, TreeTraversal.NLR);
        int[] res = t.findMode(root);
        assertArrayEquals(new int[]{2} , res);
    }

    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, null, 2}, TreeTraversal.NLR);
        int[] res = t.findMode(root);
        assertArrayEquals(new int[]{1,2} , res);
    }

    @Test
    void test_3() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1}, TreeTraversal.NLR);
        int[] res = t.findMode(root);
        assertArrayEquals(new int[]{1} , res);
    }
    @Test
    void test_4() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1,1,2}, TreeTraversal.NLR);
        int[] res = t.findMode(root);
        assertArrayEquals(new int[]{1} , res);
    }
}