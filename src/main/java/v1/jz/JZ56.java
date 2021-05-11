package v1.jz;

public class JZ56 {
    public int[] singleNumbers(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x ^= nums[i];
        }

        int h = 1;
        while ((x & h) != h) {
            h <<= 1;
        }

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & h) == h) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};

    }
}
