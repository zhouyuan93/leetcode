package v1.t400;

/**
 * @author yuan.zhou
 */
public class T495 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0 || duration == 0) {
            return 0;
        }

        int ans = 0;
        int durationEnd = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            int end = timeSeries[i] + duration;
            if (durationEnd < timeSeries[i]) {
                ans += duration;
                durationEnd = end;
            }else{
                ans += end - durationEnd;
                durationEnd = end;
            }
        }

        return ans;
    }
}
