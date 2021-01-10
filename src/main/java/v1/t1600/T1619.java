package v1.t1600;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T1619 {
    public double trimMean(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0D;
        }

        Arrays.sort(arr);

        int left = arr.length / 20;

        int count = 0;
        int right = arr.length - left;
        for (int i = left; i < right; i++) {
            count += arr[i];
        }
        return count * 1.0 / (arr.length - 2 * left);

    }
}
