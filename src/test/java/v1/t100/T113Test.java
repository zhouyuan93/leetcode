package v1.t100;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T113Test {

    T113 t;

    @BeforeEach
    void setUp() {
        t = new T113();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1}, TreeTraversal.NLR);
        List<List<Integer>> actual = t.pathSum(root, 22);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5, 4, 11, 2));
        expected.add(Arrays.asList(5, 8, 4, 5));
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}