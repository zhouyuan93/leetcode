package v1.t1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T1415 {

    public String getHappyString(int n, int k) {

        List<String> beforeList = new ArrayList<>();

        if (n == 1) {
            return k == 1 ? "a" : k == 2 ? "b" : k == 3 ? "c" : "";
        }
        getHappyString(n - 1, beforeList);
        int p = beforeList.size() / 3 * 2;

        char firstChar;
        if (k <= p) {
            p = 0;
            firstChar = 'a';
        } else if (k <= 2 * p) {
            firstChar = 'b';
        } else if (k <= 3 * p) {
            p = p * 2;
            firstChar = 'c';
        } else {
            return "";
        }

        for (String s : beforeList) {
            char sc = s.charAt(0);
            if (sc != firstChar) {
                p++;
                if (p == k) {
                    return firstChar + s;
                }
            }
        }

        return "";
    }

    public void getHappyString(int n, List<String> res) {
        if (n == 0) {
            res.add("");
            return;
        }
        if (n == 1) {
            res.add("a");
            res.add("b");
            res.add("c");
            return;
        }

        List<String> beforeList = new ArrayList<>();
        getHappyString(n - 1, beforeList);
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 0;
        for (String s : beforeList) {
            char sc = s.charAt(0);
            if (sc != 'a') {
                res.add(a, "a" + s);
                a++;
                b++;
                c++;
            }
            if (sc != 'b') {
                res.add(b, "b" + s);
                b++;
                c++;
            }
            if (sc != 'c') {
                res.add(c, "c" + s);
                c++;
            }
        }

    }
}
