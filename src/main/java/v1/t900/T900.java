package v1.t900;

/**
 * @author yuan.zhou
 */
public class T900 {
    public static class RLEIterator{
        int[] a;
        int p;
        int val;

        public RLEIterator(int[] A) {
            this.a = A;
            this.p = 0;
            this.val = a[p];
        }

        public int next(int n) {
            if(p > a.length-1){
                return -1;
            }

            while (val < n) {
                n -= val;
                p += 2;
                if (p >= a.length-1) {
                    return -1;
                }
                val = a[p];
            }
            val -= n;

            return a[p+1];
        }
    }
}
