package v1.t1400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class T1484 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int p = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] == p) {
                count++;
            }else{
                list.add(count);
                count = 1;
                p = arr[i];
            }
        }
        list.add(count);
        list.sort(Comparator.naturalOrder());
        int res = list.size();
        int i  = 0;
        while (k > 0 && i < list.size()) {
            k -= list.get(i++);
            res--;
        }
        return res + (k==0?0:1);

    }
}
