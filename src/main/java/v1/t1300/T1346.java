package v1.t1300;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T1346 {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 2 * arr[i];
        }

        int countZero = 0;
        for (int i = 0, j = 0; i < arr.length && j < arr2.length;) {
            if (arr[i] != 0 && arr[i] == arr2[j]) {
                return true;
            }
            if (arr[i] == 0 && i+1 < arr.length && arr[i+1] == 0 ) {
                return true;
            }
            if (arr[i] < arr2[j]) {
                i++;
            }else{
                j++;
            }
        }
        return false;
    }
}
