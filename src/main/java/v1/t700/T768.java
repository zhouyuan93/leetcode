package v1.t700;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T768 {

    public int maxChunksToSorted(int[] arr) {
        int[] sortArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortArr);

        int res = 1;
        int max = arr[0];
        int maxIndex = findIndex(sortArr, max, -1);
        boolean isAdd = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = findIndex(sortArr, max, maxIndex);
            }else{
                if (max == arr[i]) {
                    if (!isAdd) {
                        isAdd = true;
                    }else{
                        maxIndex++;
                    }
                }
                if (maxIndex <= i) {
                    if (i +1 < arr.length) {
                        res++;
                        if(arr[i+1] != max){
                            max = arr[i + 1];
                            maxIndex = findIndex(sortArr, max, maxIndex);
                        }
                        isAdd = false;
                    }
                }
            }
        }

        return res;
    }

    public int findIndex(int[] sortArr, int target, int left) {
        int right = sortArr.length-1;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (sortArr[mid] >= target) {
                right = mid;
            }else if(sortArr[mid] < target){
                left = mid;
            }
        }

        return left+1;

    }
}
