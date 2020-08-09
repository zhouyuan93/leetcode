package v1.t0;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T93 {
    public List<String> restoreIpAddresses(String s) {
        char[] c = s.toCharArray();

        List<String> res = restoreIpAddresses(c, 0, 4);

        return res;
    }

    public List<String> restoreIpAddresses(char[] c, int p, int count) {
        if (count <= 0) {
            return new LinkedList<>();
        }
        if (c.length - p > count * 3 || c.length - p < count) {
            return new LinkedList<>();
        }

        boolean isZero = new String(c, p, 1).equals("0");

        if (count == 1) {

            List<String> res = new LinkedList<>();

            if (isZero && c.length - p != 1) {
                return res;
            }

            String ipStr = new String(c, p, c.length - p);
            int ip = Integer.valueOf(ipStr);
            if (ip >= 0 && ip <= 255) {
                res.add(ipStr);
            }
            return res;
        }

        List<String> res = new LinkedList<>();

        count -= 1;

        for (int step = 1; step <= 3 && step < c.length - p; step++) {
            String ipStr = new String(c, p, step);
            int ip = Integer.valueOf(ipStr);
            if (ip >= 0 && ip <= 255) {
                List<String> tempRes = restoreIpAddresses(c, p + step, count);
                if (tempRes.size() > 0) {
                    for (String before : tempRes) {
                        res.add(ipStr + "." + before);
                    }
                }
            }
            if (isZero == true) {
                break;
            }
        }

        return res;

    }
}
