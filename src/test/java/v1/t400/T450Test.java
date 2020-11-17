package v1.t400;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T450Test {

    T450 t;

    @BeforeEach
    void setUp() {
        t = new T450();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5, 3, 6, 2, 4, null, 7}, TreeTraversal.NLR);
        int key = 3;
        TreeNode actual = t.deleteNode(root, key);
        System.out.println(actual);
        TreeNode expect = TreeNode.initByArray(new Integer[]{5, 2, 6, null, 4, null, 7}, TreeTraversal.NLR);
        assertEquals(expect.toString(), actual.toString());
    }

    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5}, TreeTraversal.NLR);
        int key = 5;
        TreeNode actual = t.deleteNode(root, key);
        System.out.println(actual);
        TreeNode expect = null;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5,6}, TreeTraversal.NLR);
        int key = 5;
        TreeNode actual = t.deleteNode(root, key);
        System.out.println(actual);
        TreeNode expect = TreeNode.initByArray(new Integer[]{6}, TreeTraversal.NLR);;
        assertEquals(expect.toString(), actual.toString());
    }

    @Test
    void test_4() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5,3,6,2,4,null,7}, TreeTraversal.NLR);
        int key = 0;
        TreeNode actual = t.deleteNode(root, key);
        System.out.println(actual);
        TreeNode expect = TreeNode.initByArray(new Integer[]{5,3,6,2,4,null,7}, TreeTraversal.NLR);;
        assertEquals(expect.toString(), actual.toString());
    }
}