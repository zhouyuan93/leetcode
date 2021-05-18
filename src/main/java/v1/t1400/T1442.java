package v1.t1400;

public class T1442 {
    public int countTriplets(int[] arr) {
        int sum = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            sum ^= arr[i];
            if (sum == 0) {
                count += i;
            }
            arr[i] = sum;
        }

        for (int len = 2; len < arr.length; len++) {
            for (int i = 0; i < arr.length - len; i++) {
                if (arr[i] == arr[i + len]) {
                    count += (len-1);
                }
            }
        }

        return count;

    }
}
