package v1.t700;

import com.sun.deploy.util.StringUtils;

public class T709 {
    private static int DEF = 'A' - 'a';

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('A' <= chars[i] && chars[i] <= 'Z') {
                chars[i] -=DEF;
            }
        }
        return new String(chars);
    }

}
