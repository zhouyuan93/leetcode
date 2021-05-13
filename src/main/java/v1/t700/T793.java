package v1.t700;

public class T793 {
    public int preimageSizeFZF(int K) {
        if(K < 5){
            return 5;
        }

        long left = 0;
        long right = 10L*K + 1;

        while (left + 1 < right) {
            long mid = (left + right) / 2;
            long x = getCount(mid);
            if (x == K) {
                return 5;
            }else if (x < K){
                left = mid;
            }else{
                right = mid;
            }
        }
        return 0;
    }

    public long getCount(long n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

}
