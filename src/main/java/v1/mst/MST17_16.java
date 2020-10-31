package v1.mst;

public class MST17_16 {
    public int massage(int[] nums) {
        int before2 = 0;
        int before = 0;
        for (int i = 0; i < nums.length; i++) {
            int z = Math.max(before, before2 + nums[i]);
            before2 = before;
            before = z;
        }
        return before;
    }

}
