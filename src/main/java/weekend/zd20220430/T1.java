package weekend.zd20220430;

public class T1 {

    public int countPrefixes(String[] words, String s) {
        if (words == null || words.length == 0) {
            return 0;
        }

        int res = 0;

        char[] c = s.toCharArray();

        for (String word : words) {
            if (compare(c, word.toCharArray())) {
                res++;
            }
        }

        return res;

    }

    public boolean compare(char[] c, char[] t) {
        if (c.length < t.length) {
            return false;
        }
        for (int i = 0; i < t.length; i++) {
            if (t[i] != c[i]) {
                return false;
            }
        }
        return true;
    }
}
