package v1.t1000;

import common.tree.TreeNode;
import common.util.LeetcodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class T1022Test {

    T1022 t;

    @BeforeEach
    void setUp() {
        t = new T1022();
    }

    @Test
    void test_1() {
        TreeNode root = LeetcodeUtil.initTreeNode("[1,0,1,0,1,0,1]");
        int a = t.sumRootToLeaf(root);
        int e = 22;
        assertThat(a).isEqualTo(e);
    }
}