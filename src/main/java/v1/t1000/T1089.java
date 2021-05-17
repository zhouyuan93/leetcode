package v1.t1000;

public class T1089 {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        int p = 0;
        for (; p + count < arr.length; p++) {
            if (arr[p] == 0) {
                count++;
            }
        }
        p--;
        int i =arr.length -1;
        if (p + count >= arr.length) {
            arr[i--] = arr[p--];
        }
        for (; i >= 0; i--) {
            if (arr[p] == 0) {
                arr[i--] = 0;
            }
            arr[i] = arr[p--];
        }
    }
}
