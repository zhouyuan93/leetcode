package v1.jz;

public class JZ60 {

    public double[] dicesProbability(int n) {
        double ONE = 1 / 6d;
        double[] res = new double[6];
        for (int i = 0; i < 6; i++) {
            res[i] = ONE;
        }

        for (int i = 1; i < n; i++) {
            double[] temp = new double[(i+1) * 5 + 1];
            for (int j = 0; j < 6; j++) {
                for (int ri = 0; ri < res.length; ri++) {
                    temp[j + ri] += res[ri] * ONE;
                }
            }
            res = temp;
        }

        return res;
    }
}
