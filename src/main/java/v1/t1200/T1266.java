package v1.t1200;

/**
 * @author yuan.zhou
 */
public class T1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        if (points.length < 2) {
            return 0;
        }

        int res = 0;
        for (int p = 0; p < points.length - 1; p++) {
            res += getTwoPointDistance(points[p], points[p + 1]);
        }

        return res;

    }

    public int getTwoPointDistance(int[] i, int[] j) {
        int x = Math.abs(j[0] - i[0]);
        int y = Math.abs(j[1] - i[1]);
        return Math.max(x, y);
    }

}
