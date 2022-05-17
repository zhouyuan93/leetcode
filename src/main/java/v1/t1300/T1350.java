package v1.t1300;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T1350 {
    List<Integer> list = new ArrayList<>();
    int p = 0;

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        add(root1);
        add2(root2);
        return list;
    }

    public void add2(TreeNode node) {
        if (node == null) {
            return;
        }
        add2(node.left);

        while (p < list.size() && list.get(p) < node.val) {
           p++;
        }
        if (p >= list.size()) {
            list.add(node.val);
        }else{
            list.add(p, node.val);
        }

        add2(node.right);
    }

    public void add(TreeNode node) {
        if (node == null) {
            return;
        }
        add(node.left);
        list.add(node.val);
        add(node.right);
    }

}
