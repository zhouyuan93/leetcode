package weekend.d20220522.templ;

import java.util.Arrays;

public class T2 {

    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] x = new int[capacity.length];

        int res = 0;
        for (int i = 0; i < capacity.length; i++) {
            x[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(x);

        for (int t : x) {
            additionalRocks -= t;
            if (additionalRocks < 0) {
                break;
            }
            res++;
        }

        return res;

    }

}
