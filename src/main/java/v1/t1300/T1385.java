package v1.t1300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1385 {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;

        Arrays.sort(arr2);

        List<int[]> rangList = new ArrayList<>();

        for (int i : arr2) {
            updateRang(rangList, i, d);
        }

        for (int target : arr1) {
            boolean flag = true;
            for (int[] range : rangList) {
                if (range[0] <= target && target <= range[1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res++;
            }
        }

        return res;
    }

    private void updateRang(List<int[]> rangList, int target, int d) {
        for (int[] range : rangList) {
            if (range[0] - d <= target && target <= range[1] + d) {
                range[0] = Math.min(range[0], target - d);
                range[1] = Math.max(range[1], target + d);
                return;
            }
        }
        rangList.add(new int[]{target - d, target + d});
    }
}
