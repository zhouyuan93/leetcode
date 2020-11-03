package v1.t900;

/**
 * @author yuan.zhou
 */
public class T941 {
    public boolean validMountainArray(int[] A) {
        if (A == null || A.length == 0) {
            return false;
        }
        boolean up = true;
        int before = A[0];
        for (int i = 1; i < A.length; i++) {
            int now = A[i];
            if (up) {
                if (before > now  ){
                    if (i == 1) {
                        return false;
                    }
                    up = false;
                } else if (before == now) {
                    return false;
                }
            }else{
                if (now >= before) {
                    return false;
                }
            }
            before = now;
        }
        return !up&&true;
    }
}
