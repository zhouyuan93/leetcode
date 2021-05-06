package v1.t1700;

public class T1720 {
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            first = first ^ encoded[i];
            res[i + 1] = first;
        }

        return res;
    }
}
