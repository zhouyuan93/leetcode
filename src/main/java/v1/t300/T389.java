package v1.t300;

/**
 * @author yuan.zhou
 */
public class T389 {
    public char findTheDifference(String s, String t) {
        int[] memory = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            memory[index]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            memory[index]--;
            if (memory[index] < 0) {
                return (char) ('a' + index);
            }
        }

        return '*';
    }
}
