package v1.t1700;

import java.util.Arrays;

public class T1753 {
    public int maximumScore(int a, int b, int c) {
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        return maximumScoreSort(nums[0], nums[1], nums[2]);
    }

    public int maximumScoreSort(int a, int b, int c) {
        if (c >= a + b) {
            return a + b;
        }

        int count = 0;

        int x = (a + b - c) / 2;
        count += 3*x;
        a -= 2*x;
        b -= 2*x;
        c -= 2*x;

        if (c >= a + b) {
            return count + a + b;
        }

        if (a > 1) {
            count += 3;
            a-=2;
            b-=2;
            c-=2;
        }

        if (c >= a + b) {
            return count + a + b;
        }

        if (a == 0) {
            count += b;
        }

        if (a == 1) {
            c--;
            count += Math.min(b, c) + 1;
        }

        return count;
    }

}
