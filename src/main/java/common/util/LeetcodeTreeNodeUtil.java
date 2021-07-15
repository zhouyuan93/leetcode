package common.util;

import common.tree.TreeNode;
import common.tree.TreeTraversal;

public class LeetcodeTreeNodeUtil {
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
}
