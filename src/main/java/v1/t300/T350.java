package v1.t300;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int i = 0;
        int j = 0;
        int x = 0;

        while (i < nums1.length && j < nums2.length) {
            int ni = nums1[i];
            int nj = nums2[j];

            if (ni == nj) {
                res[x++] = ni;
                i++;
                j++;
            } else if (ni < nj){
                i++;
            } else{
                j++;
            }
        }

        return Arrays.copyOf(res,x);
    }
}
