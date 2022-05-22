package weekend.d20220522.templ;

import java.util.Arrays;

public class T4 {

    public static int Mod = 1000000007;

    public long[] sum;
    public int[] min;

    public int totalStrength(int[] strength) {
        sum = new long[strength.length];
        min = new int[strength.length];

        long count = 0;
        long res = 0;
        for (int i = 0; i < strength.length; i++) {
            count += strength[i];
            count %= Mod;
            min[i] = strength[i];
            sum[i] = count;
            res += strength[i] * strength[i];
            res %= Mod;
        }

        int len = strength.length;

        for (int i = 1; i < len; i++) {

//            System.out.println("len:-----" + i);
            int[] temp = new int[strength.length];

            for (int j = i; j < len; j++) {
                int p = j;
                int e = j+i;

                int mi;
                mi = Math.min( min[j-1],  min[j]);

                temp[j] = mi;

                long y = 0;
                if (j - i - 1 < 0) {
                    y = sum[j];
                } else {
                    y = sum[j] - sum[j - i - 1];
                }
//                System.out.println(mi + " " + y);
                res += mi * y;
                res %= Mod;
            }
            min = temp;
//            System.out.println(Arrays.toString(min));
        }


        return (int) res;

    }



}
