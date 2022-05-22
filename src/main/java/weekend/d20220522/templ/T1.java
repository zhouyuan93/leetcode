package weekend.d20220522.templ;

public class T1 {
    public int percentageLetter(String s, char letter) {
        int[] sum = new int[26];

        char[] charArray = s.toCharArray();

        int count = charArray.length;
        for (char c : charArray) {
            sum[c - 'a']++;
        }

        return sum[letter - 'a'] / count;

    }
}
