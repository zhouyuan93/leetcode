package v1.t500;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T515 {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        int i = 0;

        List<Integer> res = new ArrayList<>();

        dealValues(root, i, res);

        return res;
    }

    private void dealValues(TreeNode treeNode,final int i,List<Integer> res) {
        if (treeNode == null) {
            return ;
        }
        while (i > res.size() -1 ) {
            res.add(null);
        }
        if (res.get(i) == null || treeNode.val > res.get(i)) {
            res.set(i, treeNode.val);
        }
        dealValues(treeNode.left, i + 1, res);
        dealValues(treeNode.right, i + 1, res);
    }

    List<Integer> res = new ArrayList();
    public List<Integer> largestValues2(TreeNode root) {

        bfs(root,0);

        return res;

    }

    public void bfs(TreeNode node , int f){
        if(node == null){
            return;
        }

        if(res.size() <= f){
            res.add(node.val);
        }else if(res.get(f) < node.val){
            res.set(f,node.val);
        }

        f++;
        bfs(node.left,f);
        bfs(node.right,f);
    }

}
