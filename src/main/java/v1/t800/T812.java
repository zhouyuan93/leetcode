package v1.t800;

public class T812 {
    public double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int m = j + 1; m < points.length; m++) {
                    double t = getS(points[i][1], points[i][0], points[j][1], points[j][0], points[m][1], points[m][0]);
                    if (t > res) {
                        res = t;
                    }
                }
            }
        }
        return res;
    }

    public double getS(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2) / 2d);
    }
}
