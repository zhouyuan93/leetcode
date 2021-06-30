package v1.jz;

import common.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class JZ37 {
    public static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return "[null]";
            }

            StringBuilder res = new StringBuilder();
            res.append(root.val).append(",");

            Deque<TreeNode> deque = new ArrayDeque<>();
            deque.push(root);

            int end = serialize(res, deque);
            res.delete(end - 1, res.length());
            res.append("]");
            res.insert(0, "[");
            return res.toString();
        }

        public int serialize(StringBuilder s, Deque<TreeNode> deque) {
            int end = s.length();
            while (!deque.isEmpty()) {
                TreeNode node = deque.pollLast();
                if (node.left != null) {
                    deque.push(node.left);
                    s.append(node.left.val).append(",");
                    end = s.length();
                } else {
                    s.append("null,");
                }
                if (node.right != null) {
                    deque.push(node.right);
                    s.append(node.right.val).append(",");
                    end = s.length();
                } else {
                    s.append("null,");
                }
            }
            return end;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == null || "".equals(data) || data.equals("[null]")) {
                return null;
            }

            String[] split = data.substring(1, data.length() - 1).split(",");
            TreeNode root = new TreeNode(Integer.valueOf(split[0]));

            Deque<TreeNode> deque = new ArrayDeque<>();
            deque.push(root);

            int p = 1;
            while (p < split.length) {
                TreeNode node = deque.pollLast();
                if (!"null".equals(split[p])) {
                    node.left = new TreeNode(Integer.valueOf(split[p]));
                    deque.push(node.left);
                }
                p++;

                if (p >= split.length) {
                    break;
                }

                if (!"null".equals(split[p])) {
                    node.right = new TreeNode(Integer.valueOf(split[p]));
                    deque.push(node.right);
                }
                p++;

            }


            return root;
        }
    }
}
