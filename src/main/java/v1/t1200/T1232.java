package v1.t1200;

public class T1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 3) {
            return true;
        }

        for (int i = 0; i < coordinates.length - 2; i++) {
            if (!validate(coordinates[i][1], coordinates[i][0],
                    coordinates[i + 1][1], coordinates[i + 1][0],
                    coordinates[i + 2][1], coordinates[i + 2][0])) {
                return false;
            }
        }

        return true;
    }

    public boolean validate(int x, int y, int x2, int y2, int x3, int y3) {
        return (y2 - y) * (x3 - x) == (y3 - y) * (x2 - x);
    }
}
