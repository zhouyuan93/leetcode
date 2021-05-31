package v1.t600;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T687Test {

    T687 t;

    @BeforeEach
    void setUp() {
        t = new T687();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5, 4, 5, 1, 1, 5}, TreeTraversal.NLR);
        int actual = t.longestUnivaluePath(root);
        int expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 4, 5, 4, 4, null, 5}, TreeTraversal.NLR);
        int actual = t.longestUnivaluePath(root);
        int expected = 2;
        assertEquals(expected, actual);
    }
}