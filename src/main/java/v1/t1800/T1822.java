package v1.t1800;

public class T1822 {
    public int arraySign(int[] nums) {
        int lessZero = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }else if(num < 0){
                lessZero++;
            }
        }

        return lessZero % 2 == 0 ? 1 : -1;

    }
}
