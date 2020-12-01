package v1.t1300;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T1300 {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);

        int resValue = 0;
        int resTarget = -1;

        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean addOne = true;

            int x = (target - sum) / (arr.length - i);
            // x比arr[i]小结束循环
            if (x < arr[i]) {
                resValue = x;
                resTarget = x * (arr.length - i) + sum;
                if (Math.abs(resTarget - target) > Math.abs(resTarget - target + arr.length)) {
                    resValue++;
                }
                return resValue;
            }

            // x比arr[i+1]大
            if (x > arr[i]) {
                x = arr[i];
                addOne = false;
            }

            int xTarget = x * (arr.length - i) + sum;
            if (addOne) {
                if (Math.abs(xTarget - target) > Math.abs(xTarget - target + arr.length - i)) {
                    xTarget += arr.length - i;
                    x++;
                }
            }

            if (Math.abs(resTarget - target) > Math.abs(xTarget - target)) {
                resTarget = xTarget;
                resValue = x;
            }

            sum += arr[i];
        }

        int last = arr[arr.length - 1];
        int lastTarget = sum + last;
        if (Math.abs(lastTarget - target) < Math.abs(resTarget - target)) {
            resValue = last;
            resTarget = lastTarget;
        }

        return resValue;
    }
}
