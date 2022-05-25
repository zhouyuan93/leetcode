package v1.t400;

public class T467 {
    public int findSubstringInWraproundString(String p) {
        if (p.length() == 0) {
            return 0;
        }
        if (p.length() == 1) {
            return 1;
        }

        int res = 0;

        int len = p.length();

        int[] count = new int[26];

        char b = p.charAt(len - 1);
        int memo = 1;
        count[b - 'a'] = 1;

        for (int i = len - 2; i >= 0; i--) {
            char c = p.charAt(i);
            if (c - b == -1 || (c == 'z' && b == 'a')) {
                memo++;
            } else {
                memo = 1;
            }

            int id = c - 'a';
            if (count[id] < memo) {
                count[id] = memo;
            }

            b = c;
        }

        for (int i : count) {
            res += i;
        }

        return res;
    }
}
