package v1.t1700;

public class T1704 {
    public boolean halvesAreAlike(String s) {
        int[] chars = new int[26];

        for (int i = 0; i < s.length() / 2; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                chars[c - 'a']++;
            }
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                chars[c - 'A']++;
            }
        }
        for (int i = s.length()/2; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                chars[c - 'a']--;
            }
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                chars[c - 'A']--;
            }
        }

        return chars['a' - 'a'] + chars['e' - 'a'] + chars['i' - 'a'] + chars['o' - 'a'] + chars['u' - 'a'] == 0;

    }
}
