package v1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T821 {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        Queue<Integer> indexC = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                indexC.add(i);
            }
        }
        if (indexC.size() == 0) {
            return null;
        }

        int right = indexC.remove();
        int left = -1;
        for (int i = 0; i < S.length(); i++) {
            if(i == right){
                left = right;
                right = indexC.size() == 0 ? -1 : indexC.remove();
                continue;
            }
            if (left == -1) {
                res[i] = right - i;
            } else if (right == -1) {
                res[i] = i - left;
            } else {
                res[i] = right - i < i - left ? right - i : i - left;
            }
        }
        return res;

    }

}
