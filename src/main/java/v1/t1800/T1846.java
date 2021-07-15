package v1.t1800;

import java.util.Arrays;

public class T1846 {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        int x = 1;
        for (int i = 1; i < arr.length; i++) {
            int y = arr[i];
            x = Math.min(y, x + 1);
        }

        return x;
    }
}
