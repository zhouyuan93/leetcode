package v1.t900;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T993Test {

    T993 t;

    @BeforeEach
    void setUp() {
        t = new T993();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 2, 3, 4}, TreeTraversal.NLR);
        int x = 4;
        int y = 3;
        boolean actual = t.isCousins(root, x, y);
        boolean expected = false;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1,2,3,null,4,null,5}, TreeTraversal.NLR);
        int x = 5;
        int y = 4;
        boolean actual = t.isCousins(root, x, y);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1,2,3,null,4}, TreeTraversal.NLR);
        int x = 2;
        int y = 3;
        boolean actual = t.isCousins(root, x, y);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1,2,3,null,4,null,5,6,7,8,9}, TreeTraversal.NLR);
        int x = 5;
        int y = 4;
        boolean actual = t.isCousins(root, x, y);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}