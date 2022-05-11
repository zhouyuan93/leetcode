package v1.t400;

import common.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class T449 {
    public static class Codec {

        public static final char SPLIT = ',';
        public static final char NULL = '-';

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder res = new StringBuilder();
            Queue<TreeNode> queue = new ArrayDeque<>();
            if (root == null) {
                res.append(NULL);
            }else{
                res.append(root.val);
                queue.add(root);
            }

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();

                res.append(SPLIT);
                if (node.left == null) {
                    res.append(NULL);
                }else{
                    res.append(node.left.val);
                    queue.offer(node.left);
                }

                res.append(SPLIT);
                if (node.right == null) {
                    res.append(NULL);
                }else{
                    res.append(node.right.val);
                    queue.offer(node.right);
                }
            }
            return res.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] arr = data.split(String.valueOf(SPLIT));
            if (arr.length <= 1) {
                return null;
            }

            TreeNode root = new TreeNode(Integer.valueOf(arr[0]));

            Queue<TreeNode> queue = new ArrayDeque<>();

            queue.offer(root);

            int p = 1;
            while (p < arr.length) {
                TreeNode node = queue.poll();
                String s = arr[p++];
                if (s.length()!=1 || s.charAt(0)!=NULL) {
                    node.left = new TreeNode(Integer.valueOf(s));
                    queue.offer(node.left);
                }
                s = arr[p++];
                if (s.length()!=1 || s.charAt(0)!=NULL) {
                    node.right = new TreeNode(Integer.valueOf(s));
                    queue.offer(node.right);
                }
            }
            return root;
        }
    }
}