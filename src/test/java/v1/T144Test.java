package v1;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.Test;
import v1.T144;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T144Test {
    T144 t = new T144();

    @Test
    public void test_case_1() {
        Integer[] nums = {1, null, 2, 3};
        TreeNode root = TreeNode.initByArray(nums, TreeTraversal.NLR);
        List<Integer> res = t.preorderTraversal(root);
        assertEquals(Arrays.asList(1,2,3),res);
    }
    @Test
    public void test_case_2() {
        Integer[] nums = {1, 1, 2, 3};
        TreeNode root = TreeNode.initByArray(nums, TreeTraversal.NLR);
        List<Integer> res = t.preorderTraversal(root);
        assertEquals(Arrays.asList(1,1,3,2),res);
    }

}