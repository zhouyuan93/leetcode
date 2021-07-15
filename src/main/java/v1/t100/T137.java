package v1.t100;

public class T137 {
    public int singleNumber(int[] nums) {
        int x = 0;
        int y = 0;

        for (int num : nums) {
            int xn = (~x & y & num) | (x & ~y & ~num);
            int yn = ~x & ((~y & num) | (y & ~num));
            y = yn;
            x = xn;
        }

        return y;

    }



}
