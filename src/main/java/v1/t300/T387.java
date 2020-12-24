package v1.t300;

/**
 * @author yuan.zhou
 */
public class T387 {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int[] index = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            if (index[x] < 0) {
                continue;
            } else if (index[x] == 0) {
                index[x] = i + 1;
                continue;
            } else if (index[x] > 0) {
                index[x] = -1;
                continue;
            }

        }

        int resIndex = Integer.MAX_VALUE;
        for (int num : index) {
            if (num > 0 && resIndex > num) {
                resIndex = num;
            }
        }

        return resIndex == Integer.MAX_VALUE ? -1 : resIndex - 1;

    }
}
