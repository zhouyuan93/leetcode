package v1.mst;

/**
 * @author yuan.zhou
 */
public class MST10_03 {
    public int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int len = arr.length - 1;

        int left = 0;
        int right = len;

        int p = 0;
        for (; p < arr.length - 1; p++) {
            if (arr[p] > arr[p + 1]) {
                break;
            }
        }

        if (arr[0] <= target) {
            right = p;
        } else {
            left = p + 1;
        }

        if (arr[left] == target) {
            return left;
        }

        if (arr[right] == target) {
            while (arr[right] == target) {
                right--;
            }
            return right + 1;
        }


        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                while (arr[mid] == target) {
                    mid--;
                }
                return mid + 1;
            }
            if (arr[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return -1;
    }
}
