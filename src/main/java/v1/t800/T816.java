package v1.t800;

import java.util.ArrayList;
import java.util.List;

public class T816 {
    public List<String> ambiguousCoordinates(String s) {
        List<String> res = new ArrayList<>();

        char[] chars = s.toCharArray();

        int l = 1;
        int r = s.length() - 2;

        // x,y
        for (int p = 2; p <= s.length() - 2; p++) {

            List<String> listX = new ArrayList<>();

            // x校验
            if (p - l > 1 && chars[l] == '0' && chars[p - 1] == '0') {
                continue;
            }
            // y校验
            if (r - p> 0 && chars[p] == '0' && chars[r] == '0') {
                continue;
            }

            // x无小数点
            String x = String.valueOf(chars, 1, p - 1);
            if (chars[1] != '0'|| p - l == 1) {
                listX.add(x);
            }

            // x有小数点
            if (chars[p - 1] != '0') {
                StringBuilder sb = new StringBuilder(x);
                for (int i = 1; i < x.length() ; i++) {
                    sb.insert(i, ".");
                    listX.add(sb.toString());
                    sb.deleteCharAt(i);
                    if (x.charAt(0) == '0') {
                        break;
                    }
                }
            }

            List<String> listY = new ArrayList<>();
            String y = String.valueOf(chars, p, r - p + 1);
            // y无小数点
            if (chars[p] != '0' || r - p == 0) {
                listY.add(y);
            }
            // y有小数点
            if (chars[r] != '0') {
                StringBuilder sb = new StringBuilder(y);
                for (int  j = 1; j<y.length(); j++) {
                    sb.insert(j, ".");
                    listY.add(sb.toString());
                    sb.deleteCharAt(j);
                    if (y.charAt(0) == '0') {
                        break;
                    }
                }
            }

            for (String sx : listX) {
                for (String sy : listY) {
                    res.add("(" + sx + ", " + sy + ")");
                }
            }
        }

        return res;
    }

}
