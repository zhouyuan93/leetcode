package common.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeNodeTest {

    @Test
    public void test_init_NLP() {
        Integer[] nums = new Integer[]{1, 2, 3, null, 4, null, null, 5};
        TreeNode root = TreeNode.initByArray(nums, TreeTraversal.NLR);
        System.out.println(root.toString());
    }

}