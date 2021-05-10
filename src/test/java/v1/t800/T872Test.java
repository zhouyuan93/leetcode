package v1.t800;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T872Test {

    T872 t;

    @BeforeEach
    void setUp() {
        t = new T872();
    }

    @Test
    void test_1() {
        TreeNode root1 = TreeNode.initByArray(new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4}, TreeTraversal.NLR);
        TreeNode root2 = TreeNode.initByArray(new Integer[]{3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8}, TreeTraversal.NLR);
        boolean actual = t.leafSimilar(root1, root2);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        TreeNode root1 = TreeNode.initByArray(new Integer[]{1}, TreeTraversal.NLR);
        TreeNode root2 = TreeNode.initByArray(new Integer[]{1}, TreeTraversal.NLR);
        boolean actual = t.leafSimilar(root1, root2);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        TreeNode root1 = TreeNode.initByArray(new Integer[]{2}, TreeTraversal.NLR);
        TreeNode root2 = TreeNode.initByArray(new Integer[]{1}, TreeTraversal.NLR);
        boolean actual = t.leafSimilar(root1, root2);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        TreeNode root1 = TreeNode.initByArray(new Integer[]{1, 2}, TreeTraversal.NLR);
        TreeNode root2 = TreeNode.initByArray(new Integer[]{2, 2}, TreeTraversal.NLR);
        boolean actual = t.leafSimilar(root1, root2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        TreeNode root1 = TreeNode.initByArray(new Integer[]{1, 2, 3}, TreeTraversal.NLR);
        TreeNode root2 = TreeNode.initByArray(new Integer[]{2, 3, 2}, TreeTraversal.NLR);
        boolean actual = t.leafSimilar(root1, root2);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}