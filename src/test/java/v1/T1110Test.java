package v1;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class T1110Test {
    T1110 t = new T1110();

    @Test
    public void test_1() {
        TreeNode tree = TreeNode.initByArray(new Integer[]{1,2,3,4,5,6,7}, TreeTraversal.NLR);
        List<TreeNode> res = t.delNodes(tree, new int[]{3, 5});
        Set<TreeNode> actual = new HashSet<>();
        actual.addAll(res);
        Set<TreeNode> expected = new HashSet<>();
        expected.add(TreeNode.initByArray(new Integer[]{1, 2, null, 4}, TreeTraversal.NLR));
        expected.add(TreeNode.initByArray(new Integer[]{6}, TreeTraversal.NLR));
        expected.add(TreeNode.initByArray(new Integer[]{7}, TreeTraversal.NLR));
        assertEquals(expected,actual);
    }

    @Test
    public void test_2() {
        TreeNode tree = TreeNode.initByArray(new Integer[]{1,2,3}, TreeTraversal.NLR);
        List<TreeNode> res = t.delNodes(tree, new int[]{1,2,3});
        Set<TreeNode> actual = new HashSet<>();
        actual.addAll(res);
        Set<TreeNode> expected = new HashSet<>();
        assertEquals(expected,actual);
    }

    @Test
    public void test_3() {
        TreeNode tree = TreeNode.initByArray(new Integer[]{1,2,3}, TreeTraversal.NLR);
        List<TreeNode> res = t.delNodes(tree, new int[]{1});
        Set<TreeNode> actual = new HashSet<>();
        actual.addAll(res);
        Set<TreeNode> expected = new HashSet<>();
        expected.add(TreeNode.initByArray(new Integer[]{2}, TreeTraversal.NLR));
        expected.add(TreeNode.initByArray(new Integer[]{3}, TreeTraversal.NLR));
        assertEquals(expected,actual);
    }

    @Test
    public void test_4() {
        TreeNode tree = TreeNode.initByArray(new Integer[]{1,2,3}, TreeTraversal.NLR);
        List<TreeNode> res = t.delNodes(tree, new int[]{1,2});
        Set<TreeNode> actual = new HashSet<>();
        actual.addAll(res);
        Set<TreeNode> expected = new HashSet<>();
        expected.add(TreeNode.initByArray(new Integer[]{3}, TreeTraversal.NLR));
        assertEquals(expected,actual);
    }




}