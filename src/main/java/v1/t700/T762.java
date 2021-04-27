package v1.t700;

public class T762 {
    boolean[] IS_PRIME = {false,
            false, true, true, false, true,
            false, true, false, false, false,
            true, false, true, false, false,
            false, true, false, true, false,
            false, false, true, false, false,
            false, false, false, true, false,
            true, false};

    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        for (int i = L; i <= R; i++) {
            if (IS_PRIME[Integer.bitCount(i)]) {
                res++;
            }
        }
        return res;
    }
}
