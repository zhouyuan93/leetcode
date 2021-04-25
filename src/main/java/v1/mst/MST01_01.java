package v1.mst;

/**
 * @author yuan.zhou
 */
public class MST01_01 {
    public boolean isUnique(String astr) {
        boolean[] memo = new boolean[26];
        for (int i = 0; i < astr.length(); i++) {
            int idx = astr.charAt(i) - 'a';
            if (memo[idx]) {
                return false;
            } else {
                memo[idx] = true;
            }
        }
        return true;
    }
}
