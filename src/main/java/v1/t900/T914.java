package v1.t900;

public class T914 {
    public boolean hasGroupsSizeX(int[] deck) {
        int max = Integer.MIN_VALUE;
        int[] memo = new int[10000];
        for (int i : deck) {
            memo[i]++;
            max = Math.max(max, memo[i]);
        }

        int t = max;
        for (int i : memo) {
            if (i == 0) {
                continue;
            }
            t = gcd(t, i);
            if (t == 1) {
                return false;
            }
        }

        return true;
    }

    public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
