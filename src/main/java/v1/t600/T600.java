package v1.t600;

/**
 * @author yuan.zhou
 */
public class T600 {
    public int findIntegers(int num) {
        if (num == 0) {
            return 1;
        }

        String binaryString = Integer.toBinaryString(num);

        int len = binaryString.length();

        int[] array = new int[Math.max(4, len)];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        int res = array[len - 1];

        int i = 1;
        for (; i < len; i++) {
            if (binaryString.charAt(i) == '1') {
                if (binaryString.charAt(i - 1) == '1') {
                    res += array[len - i - 1];
                    break;
                }
                res += array[len - i - 1];
            }

        }

        if (i == len) {
            res++;
        }

        return res;

    }

}
