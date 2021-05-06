package v1.t1400;

import java.util.ArrayList;
import java.util.List;

public class T1443 {
    public static class TreeNode{
        boolean hasApple;
        int val;
        List<TreeNode> next;

        public TreeNode(boolean hasApple, int val) {
            this.hasApple = hasApple;
            this.val = val;
            this.next = new ArrayList<>();
        }
    }
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        TreeNode[] nodes = new TreeNode[n];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new TreeNode(hasApple.get(i), i);
        }

        boolean[] memo = new boolean[n];
        memo[0] = true;
        int p = edges.length;
        while (p > 0) {
            int temp = 0;
            for (int i = 0; i < p; i++) {
                int[] edge = edges[i];
                if (memo[edge[0]] == true) {
                    nodes[edge[0]].next.add(nodes[edge[1]]);
                    memo[edge[1]] = true;
                }else if(memo[edge[1]] == true){
                    nodes[edge[1]].next.add(nodes[edge[0]]);
                    memo[edge[0]] = true;
                }else{
                    edges[temp++] = edges[i];
                }
            }
            p = temp;
        }

        return getCount(nodes[0]) * 2;
    }


    private int getCount(TreeNode node) {
        int res = 0;
        for (int i = 0; i < node.next.size(); i++) {
            int temp = getCount(node.next.get(i));
            if (temp > 0 || node.next.get(i).hasApple) {
                res++;
            }
            res += temp;
        }
        return res;
    }

}
