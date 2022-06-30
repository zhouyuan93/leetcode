package v1.t1900;

import common.ListNode;
import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1932Test {
    T1932 t;

    @BeforeEach
    void setUp() {
        t = new T1932();
    }

    @Test
    void test_1() {
        List<TreeNode> trees = new ArrayList<>();
        trees.add(TreeNode.initByArray(new Integer[]{5, 3, 8}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{3, 2, 6}, TreeTraversal.NLR));
        TreeNode treeNode = t.canMerge(trees);
        System.out.println(treeNode == null ? null : treeNode.toString());
    }

    @Test
    void test_2() {
        List<TreeNode> trees = new ArrayList<>();
        trees.add(TreeNode.initByArray(new Integer[]{2, 1}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{3, 2, 5}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{5, 4}, TreeTraversal.NLR));
        TreeNode treeNode = t.canMerge(trees);
        System.out.println(treeNode == null ? null : treeNode.toString());
    }

    @Test
    void test_3() {
        List<TreeNode> trees = new ArrayList<>();
        trees.add(TreeNode.initByArray(new Integer[]{5, 4}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{3}, TreeTraversal.NLR));
        TreeNode treeNode = t.canMerge(trees);
        System.out.println(treeNode == null ? null : treeNode.toString());
    }

    @Test
    void test_4() {
        List<TreeNode> trees = new ArrayList<>();
        trees.add(TreeNode.initByArray(new Integer[]{2, 1, 3}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{3, 2}, TreeTraversal.NLR));
        TreeNode treeNode = t.canMerge(trees);
        System.out.println(treeNode == null ? null : treeNode.toString());
    }

    @Test
    void test_5() {
        List<TreeNode> trees = new ArrayList<>();
        trees.add(TreeNode.initByArray(new Integer[]{1, null, 3}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{3, 1}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{4, 2}, TreeTraversal.NLR));
        TreeNode treeNode = t.canMerge(trees);
        System.out.println(treeNode == null ? null : treeNode.toString());
    }

    @Test
    void test_6() {
        List<TreeNode> trees = new ArrayList<>();
        trees.add(TreeNode.initByArray(new Integer[]{5,1}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{1,null,4}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{4,2}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{2,null,3}, TreeTraversal.NLR));
        TreeNode treeNode = t.canMerge(trees);
        System.out.println(treeNode == null ? null : treeNode.toString());
    }

    @Test
    void test_7() {
        List<TreeNode> trees = new ArrayList<>();
        trees.add(TreeNode.initByArray(new Integer[]{2,null,3}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{1,null,3}, TreeTraversal.NLR));
        trees.add(TreeNode.initByArray(new Integer[]{3,2}, TreeTraversal.NLR));
        TreeNode treeNode = t.canMerge(trees);
        System.out.println(treeNode == null ? null : treeNode.toString());
    }
}