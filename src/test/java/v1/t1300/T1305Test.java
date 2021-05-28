package v1.t1300;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1305Test {
    T1305 t;

    @BeforeEach
    void setUp() {
        t = new T1305();
    }

    @Test
    void test_1() {
        TreeNode root1 = TreeNode.initByArray(new Integer[]{2, 1, 4}, TreeTraversal.NLR);
        TreeNode root2 = TreeNode.initByArray(new Integer[]{1, 0, 3}, TreeTraversal.NLR);
        List<Integer> actual = t.getAllElements(root1, root2);
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 4);
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        TreeNode root1 = TreeNode.initByArray(new Integer[]{0,-10,10}, TreeTraversal.NLR);
        TreeNode root2 = TreeNode.initByArray(new Integer[]{5,1,7,0,2}, TreeTraversal.NLR);
        List<Integer> actual = t.getAllElements(root1, root2);
        List<Integer> expected = Arrays.asList(-10,0,0,1,2,5,7,10);
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        TreeNode root1 = null;
        TreeNode root2 = TreeNode.initByArray(new Integer[]{5,1,7,0,2}, TreeTraversal.NLR);
        List<Integer> actual = t.getAllElements(root1, root2);
        List<Integer> expected = Arrays.asList(0,1,2,5,7);
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        TreeNode root1 = TreeNode.initByArray(new Integer[]{1,null,8}, TreeTraversal.NLR);
        TreeNode root2 = TreeNode.initByArray(new Integer[]{8,1}, TreeTraversal.NLR);
        List<Integer> actual = t.getAllElements(root1, root2);
        List<Integer> expected = Arrays.asList(1,1,8,8);
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        TreeNode root1 = TreeNode.initByArray(new Integer[]{0,null,59,57,90}, TreeTraversal.NLR);
        TreeNode root2 = TreeNode.initByArray(new Integer[]{60,17,74,6,20,63,97,null,null,null,null,null,null,95}, TreeTraversal.NLR);
        List<Integer> actual = t.getAllElements(root1, root2);
        List<Integer> expected = Arrays.asList(0,6,17,20,57,59,60,63,74,90,95,97);
        assertEquals(expected, actual);
    }
}