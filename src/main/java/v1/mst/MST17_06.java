package v1.mst;

public class MST17_06 {
    public int numberOf2sInRange(int n) {
        n+= 1;

        int res = 0;
        int l = 1;
        int t = 0;
        while (n > 0) {
            int x = n % 10;
            if(x == 2){
                res += t;
            } else if (x > 2) {
                res += l;
            }

            t += x * l;
            n /= 10;
            res += n * l;

            l *= 10;

        }

        return res;

    }

}
