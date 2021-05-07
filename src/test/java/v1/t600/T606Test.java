package v1.t600;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T606Test {
    T606 t;

    @BeforeEach
    void setUp() {
        t = new T606();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 2, 3, 4}, TreeTraversal.NLR);
        String actual = t.tree2str(root);
        String expected = "1(2(4))(3)";
        assertEquals(expected,actual);
    }
}