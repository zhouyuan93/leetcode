package v1.t700;

public class T779 {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int len = 1 << (n - 2);
        if (k <= len) {
            while (k <= len) {
                n--;
                len >>= 1;
            }
            return kthGrammar(n, k);
        } else {
            return 1 ^ kthGrammar(n - 1, k - len);
        }
    }

}
