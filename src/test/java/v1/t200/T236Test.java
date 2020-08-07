package v1.t200;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T236Test {
    T236 t;

    @BeforeEach
    void setUp() {
        t = new T236();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{3,5,1,6,2,0,8,null,null,7,4}, TreeTraversal.NLR);

        TreeNode actual = t.lowestCommonAncestor(root, root.left, root.right);
        TreeNode expect = root;

        assertEquals(expect,actual);
    }
}