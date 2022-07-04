package v1.t1500;

public class T1526 {
    public int minNumberOperations(int[] target) {
        int res = 0;

        int p = 0;
        for (int i = 0; i < target.length; i++) {
            if (target[i] > p) {
                res += (target[i] - p);
            }
            p = target[i];
        }

        return res;
    }
}
