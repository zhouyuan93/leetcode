package v1.t700;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T792 {
    public int numMatchingSubseq(String S, String[] words) {
        int[][] memory = new int[26][S.length()];
        int[] end = new int[26];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int x = c - 'a';
            memory[x][end[x]++] = i;
        }

        int res = 0;
        for (String word : words) {
            int p = -1;
            int[] begin = new int[26];
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int x = c - 'a';
                while (begin[x] < end[x] && memory[x][begin[x]] < p ) {
                    begin[x]++;
                }
                if (begin[x] == end[x]) {
                    break;
                }
                p = memory[x][begin[x]++];
                if (i == word.length() - 1) {
                    res++;
                }
            }
        }

        return res;

    }



}
