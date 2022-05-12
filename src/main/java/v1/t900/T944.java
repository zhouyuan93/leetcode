package v1.t900;

public class T944 {

    public int minDeletionSize(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].length() == 0) {
            return 0;
        }
        int res = 0;
        int n = strs[0].length();

        for (int i = 0; i < n; i++) {
            if (!validate(strs,i)) {
                res++;
            }
        }

        return res;
    }

    private boolean validate(String[] strs,  int i) {
        char c = 'a';
        int m = strs.length;
        for (int j = 0; j < m; j++) {
            char t = strs[j].charAt(i);
            if (t < c) {
                return false;
            }
            c = t;
        }
        return true;
    }
}
