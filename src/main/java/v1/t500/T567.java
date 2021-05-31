package v1.t500;

import java.util.Arrays;

public class T567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] memo = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            int x = s1.charAt(i) - 'a';
            memo[x]++;
        }

        int dif = s1.length();

        for (int i = 0; i < s1.length(); i++) {
            int x = s2.charAt(i) - 'a';
            if (memo[x] > 0) {
                dif--;
            }else{
                dif++;
            }
            memo[x]--;
        }

        if (dif == 0) {
            return true;
        }

        for (int left = 0, right = s1.length() ; right < s2.length(); left++, right++) {
            int l = s2.charAt(left) - 'a';
            if (memo[l] < 0) {
                dif--;
            }else{
                dif++;
            }
            memo[l]++;

            int r = s2.charAt(right) - 'a';
            if (memo[r] > 0) {
                dif--;
            }else{
                dif++;
            }
            memo[r]--;

            if (dif == 0) {
                return true;
            }
        }

        return false;

    }
}
