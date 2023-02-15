package v1.mst;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MST17_05 {
    public String[] findLongestSubarray(String[] array) {
        int[] nums = new int[array.length+1];

        Map<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int resLeft = -1;
        map.put(0, -1);
        for (int i = 0; i < array.length; i++) {
            int x = -1;
            if (array[i].charAt(0) >= '0' && array[i].charAt(0) <= '9') {
                x = 1;
            }
            nums[i + 1] = nums[i] + x;
            if (map.containsKey(nums[i + 1])) {
                int tempLen = i - map.get(nums[i + 1]);
                if (tempLen > len) {
                    len = tempLen;
                    resLeft = i - len + 1;
                }
            }else{
                map.put(nums[i + 1], i);
            }
        }


        if (len == 0) {
            return new String[0];
        }

        return Arrays.copyOfRange(array, resLeft, resLeft + len);

    }
}
