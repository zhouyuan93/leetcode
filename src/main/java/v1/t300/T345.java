package v1.t300;

/**
 * @author yuan.zhou
 */
public class T345 {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length -1;
        while (i < j) {
            if (!isVowels(c[i])) {
                i++;
                continue;
            }
            if (!isVowels(c[j])) {
                j--;
                continue;
            }
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }

        return String.valueOf(c);
    }

    public boolean isVowels(char c) {
        return c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u' ||
         c == 'A' || c == 'E' || c == 'O' || c == 'I' || c == 'U';
    }
}
