package v1.t300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T321 {


    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        Map<Integer, List<Integer>> map1 = getMap(nums1);
        Map<Integer, List<Integer>> map2 = getMap(nums2);

        int[] begin = new int[2];

        List<int[]> conditions = new ArrayList<>();
        conditions.add(begin);

        int[] res = new int[k];
        getNextIsFrom1(map1, map2, nums1, nums2, conditions, res, k);
        return res;

    }

    public void getNextIsFrom1(Map<Integer, List<Integer>> map1, Map<Integer, List<Integer>> map2,
                                  int[] nums1, int[] nums2,
                               List<int[]> conditions, int[] res, int k) {
        if (k <= 0) {
            return;
        }

        List<int[]> nextConditions = new ArrayList<>();
        int resK = -1;

        for (int j = 0; j < conditions.size(); j++) {

            int[] begin = conditions.get(j);

            int index1 = getMaxIndex(map1, begin[0], nums1.length - k + nums2.length - begin[1]);
            int index2 = getMaxIndex(map2, begin[1], nums2.length - k + nums1.length - begin[0]);

            if (index1 == -1 && index2 == -1) {
                continue;
            }

            if (index2 != -1 && (index1 == -1 || nums1[index1] < nums2[index2])) {
                if (nums2[index2] < resK) {
                    continue;
                }
                if (nums2[index2] > resK) {
                    nextConditions = new ArrayList<>();
                    resK = nums2[index2];
                }
                nextConditions.add(new int[]{begin[0], index2+1});
                continue;
            }

            if (index1 != -1 && (index2 == -1 || nums2[index2] < nums1[index1])) {
                if (nums1[index1] < resK) {
                    continue;
                }
                if (nums1[index1] > resK) {
                    nextConditions = new ArrayList<>();
                    resK = nums1[index1];
                }
                nextConditions.add(new int[]{index1+1, begin[1]});
                continue;
            }

            if (nums1[index1] == nums2[index2]) {
                if (nums1[index1] < resK) {
                    continue;
                }
                if (nums1[index1] > resK) {
                    nextConditions = new ArrayList<>();
                    resK = nums1[index1];
                }

                nextConditions.add(new int[]{begin[0], index2 + 1});
                nextConditions.add(new int[]{index1 + 1, begin[1]});
            }
        }

        res[res.length - k] = resK;
        getNextIsFrom1(map1, map2, nums1, nums2, nextConditions, res, k - 1);

    }

    public Map<Integer, List<Integer>> getMap(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        if (nums == null) {
            return map;
        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i], list);
        }
        return map;
    }

    public int getMaxIndex(Map<Integer, List<Integer>> map, int begin, int end) {
        int max = 9;
        for (int i = max; i >= 0; i--) {
            List<Integer> list = map.getOrDefault(i, null);
            if (list == null) {
                continue;
            }
            for (Integer index : list) {
                if (index >= begin && index <= end) {
                    return index;
                }
            }
        }
        return -1;
    }


}
