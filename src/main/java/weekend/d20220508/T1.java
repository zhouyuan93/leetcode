package weekend.d20220508;

public class T1 {
    public String largestGoodInteger(String num) {
        char[] chars = num.toCharArray();
        Character res = null;
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == chars[i + 1] && chars[i] == chars[i + 2]) {
                if (res != null) {
                    if (chars[i] > res) {
                        res = chars[i];
                    }
                }else{
                    res = chars[i];
                }
            }
        }

        if (res == null) {
            return "";
        }

        return "" + res + res + res;
    }
}
