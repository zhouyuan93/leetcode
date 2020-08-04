package v1.t100;

/**
 * @author yuan.zhou
 */
public class T198 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //保存取当前节点时的最大值
        int[] py = new int[nums.length];
        //保存不取当前节点的最大值
        int[] pn = new int[nums.length];

        //初始化第一个数字
        py[0] = nums[0];
        pn[0] = 0;

        for (int i = 1; i < nums.length; i++) {
            py[i] = nums[i] + pn[i - 1];
            pn[i] = Math.max(pn[i - 1], py[i - 1]);
        }

        return Math.max(py[nums.length - 1], pn[nums.length - 1]);
    }
}
