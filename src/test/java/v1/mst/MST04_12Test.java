package v1.mst;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import common.util.LeetcodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MST04_12Test {
    MST04_12 t;

    @BeforeEach
    void setUp() {
        t = new MST04_12();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, null, 2, null, 3, null, 4, null, 5}, TreeTraversal.NLR);
        int a = t.pathSum(root, 3);
        int e = 2;
        assertThat(a).isEqualTo(e);
    }

    @Test
    void test_2() {
        TreeNode root = LeetcodeUtil.initTreeNode("[-2,null,-3]");
        int a = t.pathSum(root, -5);
        int e = 1;
        assertThat(a).isEqualTo(e);
    }
}