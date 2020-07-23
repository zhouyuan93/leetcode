package v1;

/**
 * @author yuan.zhou
 */
public class T413 {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length < 3) {
            return 0;
        }

        int res = 0;

        int diff = A[1] - A[0];
        int elements = 2;
        for (int i = 2; i < A.length; i++) {
            int x = A[i - 1];
            int y = A[i];
            if (diff == y - x) {
                elements ++;
            }else{
                res += getCount(elements);

                diff = y - x;
                elements = 2;
            }
        }

        if (elements > 2) {
            res += getCount(elements);
        }

        return res;
    }

    private int getCount(int elements) {
        if (elements < 3) {
            return 0;
        }
        int x = elements - 3 + 1;
        return x * (1 + x) / 2;
    }
}
