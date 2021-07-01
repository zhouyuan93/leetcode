package v1.t1100;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1145Test {

    T1145 t;

    @BeforeEach
    void setUp() {
        t = new T1145();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, TreeTraversal.NLR);
        int n = 11;
        int x = 3;
        boolean actual = t.btreeGameWinningMove(root, n, x);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}