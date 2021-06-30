package v1.jz;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JZ37Test {

    JZ37.Codec codec = new JZ37.Codec();

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, 2, 3, null, null, 4, 5}, TreeTraversal.NLR);
        String serialize = codec.serialize(root);
        TreeNode node = codec.deserialize(serialize);
        String nodeSerialize = codec.serialize(node);
        assertEquals(serialize, nodeSerialize);
    }

    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1}, TreeTraversal.NLR);
        String serialize = codec.serialize(root);
        TreeNode node = codec.deserialize(serialize);
        String nodeSerialize = codec.serialize(node);
        assertEquals(serialize, nodeSerialize);
    }
}