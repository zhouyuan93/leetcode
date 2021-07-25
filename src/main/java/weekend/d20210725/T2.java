package weekend.d20210725;

public class T2 {
    public String maximumNumber(String num, int[] change) {

        char[] chars = num.toCharArray();
        Boolean begin = null;
        for (int i = 0; i < num.length(); i++) {
            int c = num.charAt(i) - '0';
            if (begin == null) {
                if (change[c] > c) {
                    chars[i] = (char) ('0' + change[c]);
                    begin = true;
                }
                continue;
            }
            if (begin == true) {
                if (change[c] >= c) {
                    chars[i] = (char) ('0' + change[c]);
                } else {
                    break;
                }
            }
        }

        return String.valueOf(chars);
    }
}
