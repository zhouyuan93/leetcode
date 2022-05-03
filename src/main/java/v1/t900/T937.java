package v1.t900;

import java.util.ArrayList;
import java.util.Arrays;

public class T937 {
    public String[] reorderLogFiles(String[] logs) {

        int r = logs.length - 1;

        int count = 0;
        for (int i = logs.length - 1; i >= 0; i--) {

            while (i >= 0 && isStrLog(logs[i])) {
                i--;
            }
            if (i >= 0) {
                count++;
                String t = logs[r];
                logs[r] = logs[i];
                logs[i] = t;
                r--;
            }

        }


        r = logs.length - count;
        System.out.println(r);

        if (r >= 0) {
            Arrays.sort(logs, 0, r, this::compare);
        }

        return logs;

    }

    public int compare(String a, String b) {
        int ia = a.indexOf(" ") + 1;
        int ib = b.indexOf(" ") + 1;
        int ta = ia;
        int tb = ib;

        while (ia < a.length() && ib < b.length()) {
            char ca = a.charAt(ia++);
            char cb = b.charAt(ib++);
            if (ca != cb) {
                return ca > cb ? 1 : -1;
            }
        }

        int t = (a.length() - ta) - (b.length() - tb);
        if (t != 0) {
            return t > 0 ? 1 : -1;
        }


        int i = 0;
        while (i <= ta && i <= tb) {
            char ca = a.charAt(i);
            char cb = b.charAt(i);
            if (ca != cb) {
                return ca > cb ? 1 : -1;
            }
            i++;
        }

        if (ta == tb) {
            return 0;
        }

        return ta > tb ? 1 : -1;
    }

    public boolean isStrLog(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                i++;
                c = s.charAt(i);
                return c < '0' || c > '9';
            }
        }
        return true;
    }
}
