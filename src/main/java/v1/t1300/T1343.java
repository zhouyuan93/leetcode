package v1.t1300;

public class T1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            arr[i] -= threshold;
            sum += arr[i];
        }
        int count = 0;
        for (int i = k,j=0; i < arr.length; i++,j++) {
            if (sum >= 0) {
                count++;
            }
            arr[i] -= threshold;
            sum += arr[i];
            sum -= arr[j];
        }
        if (sum >= 0) {
            count++;
        }
        return count;
    }
}
