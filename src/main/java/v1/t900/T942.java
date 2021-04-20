package v1.t900;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T942 {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length()+1];
        boolean[] used = new boolean[s.length()+1];
        for (int i = 0; i <= s.length(); i++) {
            used[i] = true;
            res[0] = i;
            if (diStringMatch(res, used, s, 0)) {
                return res;
            }
            used[i] = false;
        }
        return res;
    }

    public boolean diStringMatch(int[] res, boolean[] used, String s, int idx) {
        if (idx >= s.length()) {
            return true;
        }
        int before = res[idx];
        char c = s.charAt(idx);
        if (c == 'I') {
            for (int i = before + 1; i < used.length; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                res[idx+1] = i;
                if (diStringMatch(res, used, s, idx + 1)) {
                    return true;
                }
                used[i] = false;
            }
        }else{
            for (int i = before - 1; i >= 0; i--) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                res[idx+1] = i;
                if (diStringMatch(res, used, s, idx + 1)) {
                    return true;
                }
                used[i] = false;
            }
        }

        return false;
    }
}
