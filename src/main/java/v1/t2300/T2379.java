package v1.t2300;

public class T2379 {
    public int minimumRecolors(String blocks, int k) {
        char[] b = blocks.toCharArray();

        int count = 0;

        for (int i = 0; i < k; i++) {
            if (b[i] == 'W') {
                count++;
            }
        }

        int res = count;

        for (int i = k; i < b.length; i++) {
            if (b[i - k] == 'W') {
                count--;
            }
            if (b[i] == 'W') {
                count++;
            }
            res = Math.min(count, res);

        }

        return res;


    }
}
