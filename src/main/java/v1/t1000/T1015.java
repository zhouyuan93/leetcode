package v1.t1000;

public class T1015 {
    public int smallestRepunitDivByK(int K) {
        if (K % 2 == 0) {
            return -1;
        }

        int x = 1;
        int y = 1;
        int res = 1;
        boolean[] memo = new boolean[K];
        do {
            if (x % K == 0) {
                return res;
            }
            memo[x] = true;
            y *= 10;
            y %= K;
            x += y;
            x %= K;
            res++;
        } while (!memo[x]);


        return -1;
    }
}
