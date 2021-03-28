package v1.t100;

import common.tree.TreeNode;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author yuan.zhou
 */
public class T173 {
    public static class BSTIterator {

        LinkedList<Integer> list;

        Iterator<Integer> it;

        public BSTIterator(TreeNode root) {
            list = new LinkedList();
            append(root);
            it = list.iterator();
        }

        public void append(TreeNode root){
            if (root == null) {
                return;
            }
            append(root.left);
            list.add(root.val);
            append(root.right);
        }

        public int next() {
            return it.next();
        }

        public boolean hasNext() {
            return it.hasNext();
        }
    }
}
