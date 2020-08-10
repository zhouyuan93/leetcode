package v1.t1000;

/**
 * @author yuan.zhou
 */
public class T1017 {
    public String baseNeg2(int N) {

        if (N  < 2) {
            return String.valueOf(N);
        }

        StringBuilder res = new StringBuilder();

        while (N != 0) {
            int x = N % -2;
            N = N / -2 + (x == -1 ? 1 : 0);
            res.append(x == -1 ? 1 : x);
        }

        return res.reverse().toString();

    }
}
