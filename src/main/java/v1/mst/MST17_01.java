package v1.mst;

public class MST17_01 {
    public int add(int a, int b) {
        int res = a ^ b;

        int up = a & b;
        while (up != 0) {
            up <<= 1;
            int t = res & up;
            res = res ^ up;
            up = t;
        }

        return res;
    }
}
