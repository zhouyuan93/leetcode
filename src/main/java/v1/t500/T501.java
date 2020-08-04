package v1.t500;

import common.tree.TreeNode;

import java.util.*;

/**
 * @author yuan.zhou
 */
public class T501 {
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        Queue<Integer> queue = new LinkedList<>();
        NLP(root, queue);
        List<Integer> res = new ArrayList<>();
        int num = queue.remove();
        int max = 0;
        int sum = 1;
        int temp = 0;

        while (!queue.isEmpty()) {
            temp = queue.remove();
            if (temp == num) {
                sum++;
            } else {
                if (sum > max) {
                    res = new ArrayList<>();
                    res.add(num);
                    max = sum;
                } else if (sum == max) {
                    res.add(num);
                }
                num = temp;
                sum = 1;
            }
        }
        if (sum > max) {
            res = new ArrayList<>();
            res.add(num);
        } else if (sum == max) {
            res.add(num);
        }
        int[] a = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            a[i] = res.get(i);
        }
        return a;
    }

    private void NLP(TreeNode root, Queue<Integer> queue) {
        if (root == null) {
            return;
        }
        NLP(root.left, queue);
        queue.add(root.val);
        NLP(root.right, queue);
    }
}
