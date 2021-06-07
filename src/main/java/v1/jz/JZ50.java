package v1.jz;

public class JZ50 {
    public char firstUniqChar(String s) {
        int[] memo = new int[26];
        char[] res = new char[26];
        int p = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            int x = c - 'a';
            if (memo[x] == 0) {
                res[p++] = c;
            }
            memo[x]++;
        }
        for (int i = p-1; i >= 0; i--) {
            if (memo[res[i] - 'a'] == 1) {
                return res[i];
            }
        }
        return ' ';
    }
}
