package v1.t600;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T696 {
    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();

        int[] memory = new int[]{0, 0};

        int res = 0;

        char beforeChar = chars[0];
        for (char c : chars) {
            if (beforeChar == c) {
                memory[c - '0']++;
            }else{
                beforeChar = c;
                res += Math.min(memory[0], memory[1]);
                memory[c - '0'] = 1;
            }
        }

        res += Math.min(memory[0], memory[1]);

        return res;

    }
}
