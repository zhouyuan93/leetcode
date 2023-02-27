package v1.t1100;

public class T1144 {
    public int movesToMakeZigzag(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2) {
            return nums[0] == nums[1] ? 1 : 0;
        }

        // 大小大小
        int m = 0;

        // 小大小大
        int n = 0;

        int x = 0;
        int y = nums[0];
        int z = nums[1];

        if (y >= z) {
            n += y - z + 1;
        }

        for (int i = 2; i < nums.length; i++) {
            x = y;
            y = z;
            z = nums[i];

            int t = y - Math.min(x, z) + 1;

            if (t > 0) {
                if ((i & 1) == 0) {
                    m += t;
                } else {
                    n += t;
                }
            }
        }

        if (z >= y) {
            if ((nums.length & 1) == 0) {
                m += z - y + 1;
            } else {
                n += z - y + 1;
            }
        }

        return Math.min(m, n);
    }
}
