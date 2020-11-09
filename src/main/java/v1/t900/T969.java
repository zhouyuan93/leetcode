package v1.t900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T969 {
    public List<Integer> pancakeSort(int[] arr) {
        int[] arrSort = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrSort);

        List<Integer> res = new ArrayList<>();
        pancakeSort(arr, arrSort, arr.length, res);
        return res;
    }

    public void pancakeSort(int[] arr, int[] arrSort, int len, List<Integer> steps) {
        if (len <= 1) {
            return;
        }

        int max = arrSort[len - 1];
        if (max != arr[len - 1]) {
            int index = getIndex(arr, max) + 1;
            //两次翻转到最后一位
            pancaking(arr, index);
            steps.add(index);
            pancaking(arr, len);
            steps.add(len);
        }

        len --;
        pancakeSort(arr, arrSort, len, steps);

    }

    public int getIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public void pancaking(int[] arr, int k) {
        int p = k / 2;
        for (int i = 0; i < p; i++,k--) {
            int temp = arr[i];
            arr[i] = arr[k - 1];
            arr[k - 1] = temp;
        }
    }
}
