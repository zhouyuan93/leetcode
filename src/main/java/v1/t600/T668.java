package v1.t600;

public class T668 {
    public static void main(String[] args) {
        int n = 7;
        int m = 9;
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < m; j++) {
                String s = " ";
                if (i * j < 10) {
                    s = "  ";
                }
                sb.append(s + i * j);
            }
            System.out.println(sb);
        }
    }

    public int findKthNumber(int m, int n, int k) {
        if (m > n) {
            return findKthNumber(n, m, k);
        }
        int l = 1;

        int r = m * n;

        if (k == r) {
            return k;
        }

        int mid;

        while (r - 1 > l) {
            mid = (l + r) / 2;
            int sum = count(m, n, mid);

            if (sum >= k) {
                r = mid;
            } else {
                l = mid;
            }
        }

        return r;

    }

    public int count(int m, int n, int x) {
        int sum = 0;
        for (int i = 1; i <= m; i++) {
            sum += Math.min(n, x / i);
        }

        return sum;
    }

}
