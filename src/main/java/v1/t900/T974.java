package v1.t900;

public class T974 {
    public int subarraysDivByK(int[] A, int K) {
        int[] record = new int[K];
        record[0] = 1;
        int sum = 0 ;
        int res = 0 ;
        for (int i : A) {
            sum+=i;
            int r = (sum % K + K) % K;
            res += record[K]++;
        }
        return res;
    }
}
