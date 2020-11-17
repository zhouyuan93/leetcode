package v1.t1300;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1379Test {
    T1379 t;

    @BeforeEach
    void setUp() {
        t = new T1379();
    }

    @Test
    void test_1() {
        TreeNode original = TreeNode.initByArray(new Integer[]{7, 4, 3, null, null, 6, 19}, TreeTraversal.NLR);
        TreeNode cloned = TreeNode.initByArray(new Integer[]{7, 4, 3, null, null, 6, 19}, TreeTraversal.NLR);
        TreeNode target = original.right;

        TreeNode actual = t.getTargetCopy(original, cloned, target);
        TreeNode expected = cloned.right;

        assertEquals(expected, actual);

    }

    @Test
    void test_2() {
        TreeNode original = TreeNode.initByArray(new Integer[]{8,null,6,null,5,null,4,null,3,null,2,null,1}, TreeTraversal.NLR);
        TreeNode cloned = TreeNode.initByArray(new Integer[]{8,null,6,null,5,null,4,null,3,null,2,null,1}, TreeTraversal.NLR);
        TreeNode target = original.right.right.right;

        TreeNode actual = t.getTargetCopy(original, cloned, target);
        TreeNode expected = cloned.right.right.right;

        assertEquals(expected, actual);

    }

    @Test
    void test_3() {
        TreeNode original = TreeNode.initByArray(new Integer[]{1,2,3,4,5,6,7,8,9,10}, TreeTraversal.NLR);
        TreeNode cloned = TreeNode.initByArray(new Integer[]{1,2,3,4,5,6,7,8,9,10}, TreeTraversal.NLR);
        TreeNode target = original.left.right;

        TreeNode actual = t.getTargetCopy(original, cloned, target);
        TreeNode expected = cloned.left.right;

        assertEquals(expected, actual);

    }
}