package v1.t600;

/**
 * @author yuan.zhou
 */
public class T670 {

    final static int[] SIZE_TABLE = {9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE};

    final static int[] UPPER = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};

    public int maximumSwap(int num) {
        int len = 1;
        for (int x : SIZE_TABLE) {
            if (x >= num) {
                break;
            }
            len++;
        }

        int max = num % 10;
        int maxIndex = 0;
        int change = 0;
        int res = num;
        for (int i = 1; i < len; i++) {
            num /= 10;
            int x = num % 10;
            if (x > max) {
                max = x;
                maxIndex = i;
            }else if (x < max) {
                change = (x - max) * UPPER[maxIndex] + (max - x) * UPPER[i];
            }

        }

        return res + change;

    }
}
