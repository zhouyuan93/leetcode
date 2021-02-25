package v1.t1200;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T1276 {
    public int maxSumDivThree(int[] nums) {
        int[][] minMod = new int[2][2];

        int sum = 0;
        for (int num : nums) {
            sum+=num;
            int m = num % 3;
            if (m != 0) {
                m--;
                if (minMod[m][0] == 0) {
                    minMod[m][0] = num;
                } else if (minMod[m][1] == 0) {
                    if (num < minMod[m][0]) {
                        minMod[m][1] = minMod[m][0];
                        minMod[m][0] = num;
                    }else{
                        minMod[m][1] = num;
                    }
                } else{
                    if (num < minMod[m][0]) {
                        minMod[m][1] = minMod[m][0];
                        minMod[m][0] = num;
                    }else if(num < minMod[m][1]){
                        minMod[m][1] = num;
                    }
                }
            }
        }

        int mod = sum % 3;

        if (mod == 0) {
            return sum;
        }

        if (mod == 1) {
            int del = sum;
            if (minMod[0][0] != 0) {
                del = Math.min(del, minMod[0][0]);
            }
            if (minMod[1][0] != 0 && minMod[1][1] != 0) {
                del = Math.min(del, minMod[1][0] + minMod[1][1]);
            }
            return sum - del;
        }

        if (mod == 2) {
            int del = sum;
            if (minMod[1][0] != 0) {
                del = Math.min(del, minMod[1][0]);
            }
            if (minMod[0][0] != 0 && minMod[0][1] != 0) {
                del = Math.min(del, minMod[0][0] + minMod[0][1]);
            }
            return sum - del;
        }

        return 0;
    }

}
