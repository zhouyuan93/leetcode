package v1.jz;

/**
 * @author yuan.zhou
 */
public class JZ3 {
    public int findRepeatNumber(int[] nums) {
        boolean flagZero = false;
        for (int i : nums) {
            i = Math.abs(i);
            if (nums[i] < 0) {
                return i;
            }else if(nums[i] == 0){
                if(flagZero == true){
                    return 0;
                }else{
                    flagZero = true;
                }
            }else{
                nums[i] = -nums[i];
            }
        }

        return 0;
    }
}
