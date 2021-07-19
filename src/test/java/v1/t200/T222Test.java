package v1.t200;

import common.tree.TreeNode;
import common.util.LeetcodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class T222Test {

    T222 t;

    @BeforeEach
    void setUp() {
        t = new T222();
    }

    @Test
    void test_1() {
        TreeNode root = LeetcodeUtil.initTreeNode("[1,2,3,4,5,6]");
        int a = t.countNodes(root);
        int e = 6;
        assertEquals(e,a);
    }
}