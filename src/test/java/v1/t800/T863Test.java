package v1.t800;

import common.tree.TreeNode;
import common.util.LeetcodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T863Test {
    
    T863 t;

    @BeforeEach
    void setUp() {
        t = new T863();
    }

    @Test
    void test_1() {
        TreeNode root = LeetcodeUtil.initTreeNode("[3,5,1,6,2,0,8,null,null,7,4]");
        TreeNode target = root.left;
        int k = 2;
        List<Integer> a = t.distanceK(root, target, k);
        a.sort(Comparator.naturalOrder());
        List<Integer> b = Arrays.asList(7, 4, 1);
        b.sort(Comparator.naturalOrder());
        assertEquals(b,a);
    }

    @Test
    void test_2() {
        TreeNode root = LeetcodeUtil.initTreeNode("[3,5,1,6,2,0,8,null,null,7,4]");
        TreeNode target = root.left.right;
        int k = 2;
        List<Integer> a = t.distanceK(root, target, k);
        a.sort(Comparator.naturalOrder());
        List<Integer> b = Arrays.asList(3,6);
        b.sort(Comparator.naturalOrder());
        assertEquals(b,a);
    }
}