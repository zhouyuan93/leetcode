package v1.t2300;

import java.util.Arrays;

public class T2325 {
    public String decodeMessage(String key, String message) {

        Integer[] arr = new Integer[26];

        int len = key.length();

        int k = 0;
        for (int i = 0; i < len; i++) {
            if (key.charAt(i) == ' ') {
                continue;
            }

            int y = key.charAt(i) - 'a';

            if (arr[y] == null) {
                arr[y] = k - y;
                k++;
            }
        }

        char[] res = message.toCharArray();
        for (int i = 0; i < res.length; i++) {
            if (res[i] == ' ') {
                continue;
            }
            int y = message.charAt(i) - 'a';
            if (arr[y] != null) {
                res[i] += arr[y];
            }
        }

        return new String(res);
    }
}
