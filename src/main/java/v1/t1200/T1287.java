package v1.t1200;

public class T1287 {
    public int findSpecialInteger(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        //小于5 大于25%
        if (arr.length < 5) {
            int res = arr[arr.length - 1];
            for (int i : arr) {
                if (res == i) {
                    return i;
                }else{
                    res = i;
                }
            }
        }

        //大于等于5
        int left = 0;
        int quarter = arr.length / 4 + 1;
        int right = quarter;

        while (right < arr.length) {
            if (arr[left] == arr[right]) {
                return arr[left];
            }

            //二分法查找和right相同的
            int tl = left;
            int tr = right;
            int p = 0;
            while (tr - tl > 1) {
                p = (tr + tl) / 2;
                if (arr[p] < arr[right]) {
                    tl = p;
                }else{
                    tr = p;
                }
            }

            left = tr;
            right = left + quarter;

        }

        throw new RuntimeException("not found");

    }
}
