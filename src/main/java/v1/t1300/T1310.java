package v1.t1300;

public class T1310 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x ^= arr[i];
            arr[i] = x;
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < res.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (left == 0) {
                res[i] = arr[right];
            }else{
                res[i] = arr[right] ^ arr[left - 1];
            }
        }

        return res;
    }
}
