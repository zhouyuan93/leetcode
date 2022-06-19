package v1.t500;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T508Test {
    T508 t;

    @BeforeEach
    void setUp() {
        t = new T508();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5,2, -3}, TreeTraversal.NLR);
        int[] actual = t.findFrequentTreeSum(root);
        int[] expected = {2, -3, 4};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5,2, -5}, TreeTraversal.NLR);
        int[] actual = t.findFrequentTreeSum(root);
        int[] expected = {2};
        assertArrayEquals(expected, actual);
    }
}