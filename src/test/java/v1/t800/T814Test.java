package v1.t800;

import common.tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T814Test {

    T814 t;

    @BeforeEach
    void setUp() {
        t = new T814();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 0, 1, 0, 0, 0, 1});
        TreeNode actual = t.pruneTree(root);
        System.out.println(actual.toString());
    }
}