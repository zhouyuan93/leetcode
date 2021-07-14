package v1.t1400;

public class T1400 {
    public boolean canConstruct(String s, int k) {
        int[] memo = new int[26];
        for (int i = 0; i < s.length(); i++) {
            memo[s.charAt(i) - 'a']++;
        }

        int count = 0;
        for (int i : memo) {
            if ((i & 1) == 1) {
                count++;
            }
        }

        if (count > k) {
            return false;
        }

        return true;

    }
}
