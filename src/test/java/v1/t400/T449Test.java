package v1.t400;

import common.tree.TreeNode;
import common.tree.TreeTraversal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T449Test {

    T449 t = new T449();

    @Test
    void test_1() {
        TreeNode root = TreeNode.initByArray(new Integer[]{2, 1, 3}, TreeTraversal.NLR);

        System.out.println(root.toString());

        T449.Codec codec = new T449.Codec();

        String ser = codec.serialize(root);
        System.out.println(ser);

        TreeNode node = codec.deserialize(ser);

        String ser2 = codec.serialize(node);

        System.out.println(ser2);

        assertEquals(ser, ser2);

    }

    @Test
    void test_2() {
        TreeNode root = TreeNode.initByArray(new Integer[]{1, null, 2}, TreeTraversal.NLR);

        System.out.println(root.toString());

        T449.Codec codec = new T449.Codec();

        String ser = codec.serialize(root);
        System.out.println(ser);

        TreeNode node = codec.deserialize(ser);

        String ser2 = codec.serialize(node);

        System.out.println(ser2);

        assertEquals(ser, ser2);

    }
}