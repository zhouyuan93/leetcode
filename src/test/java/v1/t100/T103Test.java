package v1.t100;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T103Test {

    T103 t;

    @BeforeEach
    void setUp() {
        t = new T103();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{3, 9, 20, null, null, 15, 7}, TreeTraversal.NLR);
        List<List<Integer>> actual = t.zigzagLevelOrder(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(20,9));
        expected.add(Arrays.asList(15, 7));
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i),actual.get(i));
        }
    }
}