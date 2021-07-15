package common.util;

import common.tree.TreeNode;
import common.tree.TreeTraversal;

public class LeetcodeUtil {
    public static TreeNode initTreeNode(String tree) {
        tree = tree.substring(1, tree.length() - 1);
        String[] strArr = tree.split(",");

        Integer[] intArr = new Integer[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals("null")) {
                intArr[i] = Integer.parseInt(strArr[i]);
            }
        }

        return TreeNode.initByArray(intArr, TreeTraversal.NLR);
    }

    public static int[] initIntArray(String str) {
        str = str.substring(1, str.length() - 1);
        String[] split = str.split(",");
        int[] res = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            res[i] = Integer.parseInt(split[i]);
        }
        return res;
    }
}
