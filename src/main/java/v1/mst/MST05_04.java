package v1.mst;

import java.util.Arrays;

public class MST05_04 {
    public int[] findClosedNumbers(int num) {
        if (num == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }

        String s = Integer.toBinaryString(num);
        char[] temp = new char[s.length() + 1];
        temp[0] = '0';
        for (int i = 0; i < s.length(); i++) {
            temp[i + 1] = s.charAt(i);
        }

        char[] max = Arrays.copyOf(temp, temp.length);
        int x = -1;
        int one = -1;
        int p = max.length;
        for (int i = max.length - 1; i >= 0; i--) {
            char c = max[i];
            if (c == '0') {
                if (one != -1) {
                    max[i] = '1';
                    max[p] = '0';
                    x = Integer.parseInt(String.valueOf(max), 2);
                    break;
                }
            } else {
                max[i] = '0';
                max[--p] = '1';
                one = i;
            }

        }

        char[] min = Arrays.copyOf(temp, temp.length);
        int y = -1;
        int zero = -1;
        int q = min.length;
        for (int i = min.length - 1; i >= 0; i--) {
            char c = min[i];
            if (c == '1') {
                if (zero != -1) {
                    min[i] = '0';
                    min[q] = '1';
                    y = Integer.parseInt(String.valueOf(min), 2);
                    break;
                }
            } else {
                min[i] = '1';
                min[--q] = '0';
                zero = i;
            }

        }

        return new int[]{x, y};
    }
}
