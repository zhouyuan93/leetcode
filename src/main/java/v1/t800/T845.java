package v1.t800;

public class T845 {
    public int longestMountain(int[] A) {
        boolean upper = true;
        int res = 0;
        int len = 1;
        for (int i = 1; i < A.length; i++) {
            if (upper) {
                if (A[i] > A[i - 1]) {
                    len++;
                } else if (A[i] < A[i - 1]) {
                    if (len > 1) {
                        upper = false;
                        len++;
                    } else {
                        len = 1;
                    }
                } else {
                    len = 1;
                }
            } else {
                if (A[i] < A[i - 1]) {
                    len++;
                } else if (A[i] > A[i - 1]) {
                    if (len >= 3) {
                        res = Math.max(res, len);
                    }
                    upper = true;
                    len = 2;
                }else{
                    if (len >= 3) {
                        res = Math.max(res, len);
                    }
                    upper = true;
                    len = 1;
                }
            }
        }

        if (!upper) {
            if (len >= 3) {
                res = Math.max(res, len);
            }
        }

        return res;

    }
}
