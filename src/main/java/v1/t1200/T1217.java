package v1.t1200;

public class T1217 {
    public int minCostToMoveChips(int[] position) {
        int one = 0;
        int zero = 0;
        for (int x : position) {
            one += (x & 1);
            zero += (x & 1) ^ 1;
        }
        return Math.min(one, zero);
    }
}
