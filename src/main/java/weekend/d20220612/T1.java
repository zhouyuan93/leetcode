package weekend.d20220612;

public class T1 {
    public double calculateTax(int[][] b, int income) {
        double res = 0d;

        int x = 0;
        for (int i = 0; i < b.length; i++) {
            int[] v = b[i];
            if (x <= income && income <= v[0]) {
                res += (income - x) * v[1];
                break;
            }else {
                res += (v[0] - x) * v[1];
            }
            x = v[0];
        }

        return res/100d;

    }
}
