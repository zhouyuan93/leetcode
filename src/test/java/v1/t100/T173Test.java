package v1.t100;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T173Test {

    T173 t;

    @BeforeEach
    void setUp() {
        t = new T173();
    }

    @Test
    void test1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{2, 1, 3}, TreeTraversal.NLR);
        T173.BSTIterator bstIterator = new T173.BSTIterator(root);
        assertEquals(bstIterator.hasNext(),true);
        assertEquals(bstIterator.next(),1);
        assertEquals(bstIterator.hasNext(),true);
        assertEquals(bstIterator.next(),2);
        assertEquals(bstIterator.hasNext(),true);
        assertEquals(bstIterator.next(),3);
        assertEquals(bstIterator.hasNext(),false);
    }
}