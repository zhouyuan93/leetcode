package v1.t800;

import common.tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T894Test {
    T894 t;

    @BeforeEach
    void setUp() {
        t = new T894();
    }

    @Test
    void test_1() {
        int n = 1;
        List<TreeNode> actual = t.allPossibleFBT(n);
        System.out.println(actual);
    }

    @Test
    void test_2() {
        int n = 3;
        List<TreeNode> actual = t.allPossibleFBT(n);
        System.out.println(actual);
    }

    @Test
    void test_3() {
        int n = 5;
        List<TreeNode> actual = t.allPossibleFBT(n);
        for (TreeNode treeNode : actual) {
            System.out.println(treeNode);
        }
    }

    @Test
    void test_4() {
        int n = 7;
        List<TreeNode> actual = t.allPossibleFBT(n);
        for (TreeNode treeNode : actual) {
            System.out.println(treeNode);
        }
    }
}