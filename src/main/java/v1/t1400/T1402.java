package v1.t1400;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T1402 {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int res = 0;
        int sum = 0;
        for (int i = satisfaction.length - 1; i >= 0; i--) {
            if (sum + satisfaction[i] > 0) {
                res += sum + satisfaction[i];
                sum += satisfaction[i];
            } else {
                break;
            }
        }
        return res;
    }
}
