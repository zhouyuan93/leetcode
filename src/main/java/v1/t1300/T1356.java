package v1.t1300;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author yuan.zhou
 */
public class T1356 {
    public int[] sortByBits(int[] arr) {
        long[] temp = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            long t = arr[i];
            long count = getCount(arr[i]);
            t += count << 32;
            temp[i] = t;
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            arr[i] = (int) (temp[i] & Integer.MAX_VALUE);
        }
        return arr;
    }

    public long getCount(int i) {
        long count = 0;
        while (i > 0) {
            count += i & 1;
            i >>= 1;
        }
        return count;
    }

}
