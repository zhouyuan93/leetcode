package history;

public class T171 {
    private static int MULTI = 26;

    public int titleToNumber(String s){
        if (s == null || "".equals(s)) {
            return 0;
        }
        int i = s.length() - 1;
        int res = 0;
        for (char c : s.toCharArray()) {
            res += multiMethod(c, i--);
        }
        return res;
    }

    public int multiMethod(char s, int i) {
        int res = s - 'A' + 1;
        while (i-- > 0) {
           res *= MULTI;
        }
        return res;
    }


}
