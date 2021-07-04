package v1.t600;

public class T645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int tol = (1 + n) * n / 2;
        int[] s = new int[nums.length + 1];

        int set = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (s[num] == 0) {
                set += num;
            }
            s[num] = 1;
        }
        return new int[]{sum - set, tol - set};
    }
}
