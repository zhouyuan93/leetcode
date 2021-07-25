package v1.t1700;

public class T1734 {
    public int[] decode(int[] encoded) {
        int n = encoded.length+1;
        int x = 1;
        for (int i = 2; i <= n; i++) {
            x ^= i;
        }
        for (int i = 1; i < encoded.length; i+=2) {
            x ^= encoded[i];
        }

        int[] res = new int[encoded.length + 1];
        res[0] = x;
        for (int i = 0; i < encoded.length; i++) {
            x ^= encoded[i];
            res[i+1] = x;
        }

        return res;
    }
}
