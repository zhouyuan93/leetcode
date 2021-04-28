package v1.t500;

import java.util.Arrays;

public class T556 {
    public static final char[] MAX = Integer.toString(Integer.MAX_VALUE).toCharArray();
    public int nextGreaterElement(int n) {
        char[] arr = Integer.toString(n).toCharArray();
        int left;
        boolean hasRes = false;
        for (left = arr.length - 2; left >= 0; left--) {
            if (arr[left] < arr[left + 1]) {
                hasRes = true;
                break;
            }
        }
        if (!hasRes) {
            return -1;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[left] < arr[i]) {
                char temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                break;
            }
        }
        Arrays.sort(arr, left + 1, arr.length);

        if (arr.length == MAX.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > MAX[i]) {
                    return -1;
                }else if (arr[i] < MAX[i]) {
                    break;
                }
            }
        }

        return  Integer.valueOf(new String(arr));
    }

}
