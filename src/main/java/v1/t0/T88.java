package v1.t0;

/**
 * @author yuan.zhou
 */
public class T88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            nums1 = nums2;
            return;
        }
        if (nums2 == null || nums2.length == 0) {
            return;
        }
        int p1 = m - 1;
        int p2 = n - 1;

        int pEnd = nums1.length - 1;

        while (p1 != -1 && p2 != -1) {
            if (nums1[p1] > nums2[p2]) {
                nums1[pEnd--] = nums1[p1--];
            }else{
                nums1[pEnd--] = nums2[p2--];
            }
        }

//        while (p1 != -1) {
//            nums1[pEnd--] = nums1[p1--];
//        }

        while (p2 != -1) {
            nums1[pEnd--] = nums2[p2--];
        }

    }
}
