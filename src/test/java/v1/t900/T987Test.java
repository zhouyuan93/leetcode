package v1.t900;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T987Test {

    T987 t;

    @BeforeEach
    void setUp() {
        t = new T987();
    }

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 2, 3, 4, 6, 5, 7}, TreeTraversal.NLR);
        List<List<Integer>> actual = t.verticalTraversal(root);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(4));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(1,5,6));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(7));
        assertEquals(expected,actual);
    }
}