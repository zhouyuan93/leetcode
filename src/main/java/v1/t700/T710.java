package v1.t700;

import java.util.Arrays;
import java.util.Random;

public class T710 {
    static class Solution {

        Random random = new Random();
        int len;
        int[] b;
        int n ;

        public Solution(int n, int[] blacklist) {
            Arrays.sort(blacklist);

            this.n = n;

            this.len = this.n - blacklist.length;

            this.b = blacklist;
        }

        public int pick() {
            int x = random.nextInt(len);

            int y = getIndex(x);

            return x + y;
        }

        private int getIndex(int x) {
            int l = 0;
            int r = b.length;
            int mid = 0;

            while (l < r) {
                mid = (l + r) >> 1;
                if (b[mid] > x) {
                    r = mid;
                }else{
                    l = mid + 1;
                }
            }

            while (l < b.length && b[l] <= x + l) {
                l++;
            }

            return l;
        }
    }
}
