package v1.t200;

public class T275 {
    public int hIndex(int[] citations) {
        if (citations[0] >= citations.length) {
            return citations.length;
        }


        int len = citations.length;
        int right = citations.length;
        int left = 0;

        int res = 0;
        while (left < right - 1) {
            int mid = (left + right) / 2;

            int idx = len - mid;
            if (citations[idx] >= mid) {
                res = mid;
                left = mid;
            }else{
                right = mid;
            }

        }

        return res;

    }
}
