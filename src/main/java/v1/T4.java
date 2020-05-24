package v1;

/**
 * @author yuan.zhou
 * <p>
 * 参考解答
 */
public class T4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int totalLen = len1 + len2;

        if (totalLen % 2 == 1) {
            int midIndex = totalLen / 2;
            return getKthElement(nums1, nums2, midIndex + 1);
        } else {
            int midLeftIndex = totalLen / 2 - 1;
            int midRightIndex = totalLen / 2;
            return (getKthElement(nums1, nums2, midLeftIndex + 1)
                    + getKthElement(nums1, nums2, midRightIndex + 1)) / 2.0;
        }

    }

    public double getKthElement(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int p1 = 0;
        int p2 = 0;

        while (true) {
            if (p1 == len1) {
                return nums2[p2 + k - 1];
            }
            if (p2 == len2) {
                return nums1[p1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[p1], nums2[p2]);
            }

            int half = k / 2;
            int newP1 = Math.min(p1 + half, nums1.length) - 1;
            int newP2 = Math.min(p2 + half, nums2.length) - 1;

            int element1 = nums1[newP1];
            int element2 = nums2[newP2];
            if (element1 < element2) {
                k -= (newP1 - p1 + 1);
                p1 = newP1 + 1;
            } else {
                k -= (newP2 - p2 + 1);
                p2 = newP2 + 1;
            }


        }
    }
}
