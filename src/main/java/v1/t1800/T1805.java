package v1.t1800;

import java.util.HashMap;
import java.util.HashSet;

public class T1805 {
    public int numDifferentIntegers(String word) {
        HashSet<String> res = new HashSet<>();
        StringBuilder num = null;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            boolean isNum = c >= '0' && c <= '9';
            if (isNum) {
                if (num == null) {
                    num = new StringBuilder();
                }
                if (num.length() != 0 || c != '0') {
                    num.append(c);
                }
            }else {
                if (num != null) {
                    if (num.length() == 0) {
                        res.add("0");
                    }else{
                        res.add(num.toString());
                    }
                }
                num = null;
            }
        }
        if (num != null) {
            if (num.length() == 0) {
                res.add("0");
            }else{
                res.add(num.toString());
            }
        }
        return res.size();
    }
}
