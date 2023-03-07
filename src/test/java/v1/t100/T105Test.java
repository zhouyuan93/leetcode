package v1.t100;

import common.tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T105Test {

    T105 t;

    @BeforeEach
    void setUp() {
        t = new T105();
    }

    @Test
    void test_1() {
        int[] p = {3, 9, 20, 15, 7};
        int[] i = {9, 3, 15, 20, 7};
        TreeNode treeNode = t.buildTree(p, i);
        System.out.println(treeNode.toString());
    }
}