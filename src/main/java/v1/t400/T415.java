package v1.t400;

/**
 * @author yuan.zhou
 */
public class T415 {

    public String addStrings(String num1, String num2) {
        char[] num1Chars = num1.toCharArray();
        char[] num2Chars = num2.toCharArray();

        if (num1Chars.length > num2Chars.length) {
            char[] temp = num1Chars;
            num1Chars = num2Chars;
            num2Chars = temp;
        }

        int carry = 0;
        StringBuilder res = new StringBuilder();
        int j = num2Chars.length - 1;
        for (int i = num1Chars.length - 1; i >= 0; i--,j--) {
            int p = num1Chars[i] + num2Chars[j] - 2 * '0' + carry;
            res.append(p % 10);
            carry = p / 10;
        }
        for (; j >= 0; j--) {
            int p = num2Chars[j] - '0' + carry;
            res.append(p % 10);
            carry = p / 10;
        }
        if (carry > 0) {
            res.append(carry);
        }

        return res.reverse().toString();

    }
}
