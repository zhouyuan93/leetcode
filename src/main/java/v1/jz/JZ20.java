package v1.jz;

import java.util.regex.Pattern;

public class JZ20 {
    public boolean isNumber(String s) {
        if (s.endsWith("f") || s.endsWith("D")) {
            return false;
        }
        try {
            Double.valueOf(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
