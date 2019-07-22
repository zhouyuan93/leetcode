import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T515Test {
    T515 t = new T515();
    @Test
    public void test_case_1() {
        Integer[] nums = new Integer[]{1,3,2,5,3,null,9,null,2,null,3,4,5};
        TreeNode root = TreeNode.initByArray(nums, TreeTraversal.NLR);
        List<Integer> res = t.largestValues(root);
        assertEquals(Arrays.asList(1,3,9,5),res);
    }

    @Test
    public void test_case_2() {
        Integer[] nums = new Integer[]{1, 2, null, 3, null, 4, null, 5, null,6};
        TreeNode root = TreeNode.initByArray(nums, TreeTraversal.NLR);
        List<Integer> res = t.largestValues(root);
        assertEquals(Arrays.asList(1,2,3,4,5,6),res);
    }

    @Test
    public void test_case_3() {
        TreeNode root = new TreeNode(1);
        List<Integer> res = t.largestValues(root);
        assertEquals(Arrays.asList(1),res);
    }

}