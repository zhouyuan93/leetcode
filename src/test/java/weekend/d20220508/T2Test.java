package weekend.d20220508;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2Test {
    T2 t = new T2();

    @Test
    void test1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{4, 8, 5, 0, 1, null, 6}, TreeTraversal.NLR);
        assertEquals(5, t.averageOfSubtree(root));

    }


    @Test
    void test11() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1}, TreeTraversal.NLR);
        assertEquals(1, t.averageOfSubtree(root));
    }

}