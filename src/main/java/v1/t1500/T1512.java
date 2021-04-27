package v1.t1500;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class T1512 {

    public int numIdenticalPairs(int[] nums) {
        int[] memo = new int[101];
        for (int num : nums) {
            memo[num]++;
        }

        int res= 0;
        for (int x : memo) {
            if(x>1){
                res += (x - 1) * x / 2;
            }
        }

        return res;
    }

}
