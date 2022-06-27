package v1.t500;

import java.util.Arrays;
import java.util.Comparator;

public class T522 {

    public int findLUSlength(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));

        for (int i = strs.length - 1; i >= 0; i--) {
            String x = strs[i];
            if (x == null) {
                continue;
            }


            boolean validate = true;

            int j = i - 1;
            if (j >= 0 && strs[j].length() == x.length()) {
                while (j >= 0 && strs[j].length() == x.length()) {
                    if (strs[j].equals(x)) {
                        validate = false;
                    }
                    j--;
                }
                if (!validate) {
                    continue;
                }
            }

            for (j = i + 1; j < strs.length; j++) {
                String y = strs[j];
                if (isChild(x, y)) {
                    validate = false;
                    break;
                }
            }
            if (validate) {
                return x.length();
            }

        }

        return -1;

    }

    public boolean isChild(String x, String y) {
        char[] xc = x.toCharArray();
        char[] yc = y.toCharArray();

        int xi = 0, yi = 0;
        for (; xi < xc.length && yi < yc.length; xi++, yi++) {
            while (yi < yc.length && xc[xi] != yc[yi]) {
                yi++;
            }
            if (yi >= yc.length) {
                return false;
            }
        }
        return xi == x.length();
    }
}
