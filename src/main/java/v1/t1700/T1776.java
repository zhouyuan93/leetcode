package v1.t1700;

public class T1776 {
    public double[] getCollisionTimes(int[][] cars) {
        int len = cars.length;
        double[] res = new double[len];
        res[len - 1] = -1;

        for (int i = cars.length - 2; i >= 0; i--) {
            int[] now = cars[i];
            res[i] = -1;
            int target = i + 1;

            boolean isMerge = false;
            while (target < cars.length) {
                if (res[target] < 0) {
                    break;
                }

                if (now[1] <= cars[target][1]) {
                    target++;
                    continue;
                }

                double t = (cars[target][0] - now[0]) / (double) (now[1] - cars[target][1]);
                if (res[target] >= t) {
                    res[i] = t;
                    isMerge = true;
                    break;
                }

                target++;
            }
            if (!isMerge) {
                if (now[1] > cars[target][1]) {
                    res[i] = (cars[target][0] - now[0]) / (double) (now[1] - cars[target][1]);
                }
            }
        }

        return res;
    }
}
