package v1.t600;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T671Test {

    T671 t;

    @BeforeEach
    void setUp() {
        t = new T671();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{2, 2, 5, 5, 7}, TreeTraversal.NLR);
        int actual = t.findSecondMinimumValue(root);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{2,2,2}, TreeTraversal.NLR);
        int actual = t.findSecondMinimumValue(root);
        int expected = -1;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        TreeNode root = TreeNode.initByArray(new Integer[]{2,2,2,3,2,2,4}, TreeTraversal.NLR);
        int actual = t.findSecondMinimumValue(root);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1,1,3,1,1,3,4,3,1,1,1,3,8,4,8,3,3,1,6,2,1}, TreeTraversal.NLR);
        int actual = t.findSecondMinimumValue(root);
        int expected = 2;
        assertEquals(expected,actual);
    }
}