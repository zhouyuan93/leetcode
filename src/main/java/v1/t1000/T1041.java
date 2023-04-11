package v1.t1000;

public class T1041 {
    public boolean isRobotBounded(String instructions) {
        int idx = 0;

        int d = 1000;

        int len = instructions.length();
        for (int i = 0; i < len; i++) {
            char c = instructions.charAt(i);
            switch (c) {
                case 'G':
                    idx += d;
                    break;
                case 'L':
                    d = getL(d);
                    break;
                case 'R':
                    d = getR(d);
                    break;
                default:
                    throw new RuntimeException("failed");
            }
        }

        return idx == 0 || d != 1000;
    }

    private static int getL(int d) {
        if (d == 1000) {
            d = -1;
        } else if (d == -1) {
            d = -1000;
        } else if (d == -1000) {
            d = 1;
        } else {
            d = 1000;
        }
        return d;
    }

    private static int getR(int d) {
        if (d == 1000) {
            d = 1;
        } else if (d == 1) {
            d = -1000;
        } else if (d == -1000) {
            d = -1;
        } else {
            d = 1000;
        }
        return d;
    }
}
