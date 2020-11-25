package v1.t1300;

/**
 * @author yuan.zhou
 */
public class T1370 {
    public String sortString(String s) {
        int[] memory = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int j = s.charAt(i) - 'a';
            memory[j]++;
        }

        int p = -1;
        int change = 1;

        char[] res = new char[s.length()];
        for (int i = 0; i < res.length; i++) {
            while (true) {
                p += change;
                if (p == 26) {
                    change = -1;
                    p = 25;
                } else if (p == -1) {
                    change = 1;
                    p = 0;
                }

                if (memory[p] > 0) {
                    res[i] = (char) ('a' + p);
                    memory[p]--;
                    break;
                }
            }
        }

        return String.valueOf(res);

    }
}
