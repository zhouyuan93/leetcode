package v1.t0;

import java.math.BigDecimal;

public class T65 {
    public boolean isNumber(String s) {
        boolean hasE = false;
        boolean hasD = false;
        boolean hasAdd = false;
        boolean hasSub = false;


        int len = s.length();

        int i = len - 1;
        for (; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'e' || c == 'E') {
                if (hasD || hasE || i == len - 1 || i == 0) {
                    return false;
                }
                hasE = true;
                hasAdd = false;
                hasSub = false;
            } else if (c == '.') {
                if (hasAdd || hasSub || hasD) {
                    return false;
                }
                if (i < len - 1) {
                    char x = s.charAt(i + 1);
                    if (x >= '0' && x <= '9') {
                        hasD = true;
                        continue;
                    }
                }
                if (i > 0) {
                    char x = s.charAt(i - 1);
                    if (x >= '0' && x <= '9') {
                        hasD = true;
                        continue;
                    }
                }
                return false;
            } else if (c >= '0' && c <= '9') {
                if (hasAdd || hasSub) {
                    return false;
                }
                continue;
            } else if (c == '+') {
                if (hasAdd || hasSub || i == len - 1) {
                    return false;
                }
                char x = s.charAt(i + 1);
                if (x < '0' || x > '9') {
                    if (x != '.') {
                        return false;
                    }
                }
                hasAdd = true;
            } else if (c == '-') {
                if (hasAdd || hasSub || i == len - 1) {
                    return false;
                }
                char x = s.charAt(i + 1);
                if (x < '0' || x > '9') {
                    if (x != '.') {
                        return false;
                    }
                }
                hasSub = true;
            } else {
                return false;
            }
        }

        return true;

    }
}
