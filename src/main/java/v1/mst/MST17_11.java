package v1.mst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MST17_11 {
    public int findClosest(String[] words, String word1, String word2) {

        int idx1 = -1;
        int idx2 = -1;

        int res = words.length;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                idx1 = i;
            }else if (word.equals(word2)) {
                idx2 = i;
            }

            if (idx1 != -1 && idx2 != -1) {
                res = Math.min(res, Math.abs(idx1 - idx2));
            }
        }

        return res;

    }
}
