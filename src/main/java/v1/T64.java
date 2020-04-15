package v1;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T64 {

    public int[] plusOne(int[] digits) {
        int p = digits.length - 1;
        boolean overSize = false;
        while (p >= 0) {
            int x = digits[p] + 1;
            overSize = x >= 10;
            if (overSize) {
                digits[p] = x - 10;
            }else{
                digits[p] = x;
                break;
            }
            p--;
        }
        if (overSize) {
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            for (int i = 0; i < digits.length; i++ ) {
                temp[i + 1] = digits[i];
            }
            digits = temp;
        }
        return digits;
    }
}
