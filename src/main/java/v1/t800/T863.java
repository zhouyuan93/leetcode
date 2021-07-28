package v1.t800;

import common.tree.TreeNode;

import java.util.*;

public class T863 {

    List<Integer> res;
    Deque<TreeNode> father;

    public static void main(String[] args) {
        boolean b = Arrays.asList().stream().anyMatch(p -> "71942".equals(p));
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        res = new LinkedList<>();
        father = new LinkedList<>();

        initFather(root,target);

        TreeNode before = target;
        getRes(target, k);
        for (TreeNode f : father) {
            if (f.left == before) {
                f.left = null;
            }
            if (f.right == before) {
                f.right = null;
            }
            k--;
            getRes(f, k);
            before = f;
        }

        return res;
    }

    public Integer initFather(TreeNode node, TreeNode target) {
        if (node == null) {
            return null;
        }

        if (node.val == target.val) {
            return node.val;
        }

        Integer p = initFather(node.left, target);
        if (p != null && p == target.val) {
            father.add(node);
            return p;
        }

        p = initFather(node.right, target);
        if(p != null && p == target.val){
            father.add(node);
        }

        return p;
    }

    public void getRes(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        if (k == 0) {
            res.add(node.val);
            return;
        }

        k--;
        getRes(node.left, k );
        getRes(node.right, k );
    }

}
