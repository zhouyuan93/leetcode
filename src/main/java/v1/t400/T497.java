package v1.t400;

import java.util.Arrays;
import java.util.Random;

public class T497 {

    static class Solution {


        int count = 0;
        long[] t;
        int[][] rects;
        Random r = new Random();


        public Solution(int[][] rects) {
            this.rects = rects;
            t = new long[rects.length];
            int i = -1;
            for (int[] rect : rects) {
                i++;
                int x = rect[0];
                int y = rect[1];
                int m = rect[2];
                int n = rect[3];

                int a = Math.abs(m - x);
                int b = Math.abs(n - y);

                count += a*b;
                t[i] = count;
            }
        }

        public int[] pick() {
            int d = r.nextInt(count);

            int l = 0;
            int r = t.length;
            int mid = (l + r) / 2;
            while (l < r) {
                mid = (l + r) / 2;
                if (t[mid] > d) {
                    r = mid;
                }else {
                    l = mid + 1;
                }
            }

            int[] rect = rects[r];
            int x = rect[0];
            int y = rect[1];
            int m = rect[2];
            int n = rect[3];

            return new int[]{get(x, m), get(y, n)};
        }

        private int get(int x, int y) {
            return x + r.nextInt(y - x + 1);
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{82918473, -57180867, 82918476, -57180863},
                {83793579, 18088559, 83793580, 18088560},
                {66574245, 26243152, 66574246, 26243153},
                {72983930, 11921716, 72983934, 11921720}};
        double[] count = {0, 0, 0, 0};
        Solution t = new Solution(nums);
        for (int i = 0; i < 1000000; i++) {
            int[] s = t.pick();
            boolean v = false;
            int j = -1;
            for (int[] num : nums) {
                j++;
                int x = s[0];
                int y = s[1];
                if (num[0] <= x && x <= num[2] && num[1] <= y && y <= num[3]) {
                    count[j]++;
                    v = true;
                    break;
                }
            }
        }

        for (int i = 0; i < count.length; i++) {
            count[i] /= 1000000;
            count[i] *= t.count;
        }

        System.out.println(Arrays.toString(count));

    }
}
