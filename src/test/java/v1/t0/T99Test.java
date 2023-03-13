package v1.t0;

import common.tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T99Test {

    T99 t;

    @BeforeEach
    void setUp() {
        t = new T99();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 3, null, null, 2});
        t.recoverTree(root);

        TreeNode actual = TreeNode.initByArray(new Integer[]{3, 1, null, null, 2});
        assertEquals(root.toString(), actual.toString());
    }
    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{146,71,-13,55,null,231,399,321,null,null,null,null,null,-33});
        t.recoverTree(root);

        TreeNode actual = TreeNode.initByArray(new Integer[]{146,71,321,55,null,231,399,-13,null,null,null,null,null,-33});
        assertEquals(root.toString(), actual.toString());
    }

    @Test
    void test_3() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1,3,null,2,null,4});
        t.recoverTree(root);

        TreeNode actual = TreeNode.initByArray(new Integer[]{4,3,null,2,null,1});
        assertEquals(root.toString(), actual.toString());
    }

    @Test
    void test_4() {
        TreeNode root = TreeNode.initByArray(new Integer[]{3,1,4,null,null,2});
        t.recoverTree(root);

        TreeNode actual = TreeNode.initByArray(new Integer[]{2,1,4,null,null,3});
        assertEquals(root.toString(), actual.toString());
    }
}