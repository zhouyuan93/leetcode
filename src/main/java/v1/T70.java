package v1;

/**
 * @author yuan.zhou
 */
public class T70 {

    public int climbStairs(int n) {
        if (n < 4) {
            return n;
        }
        int[] memories = new int[n];
        memories[0] = 1;
        memories[1] = 2;
        memories[2] = 3;
        for (int i = 3; i < n; i++) {
            memories[i] = memories[i - 1] + memories[i - 2];
        }
        return memories[n-1];

    }


    //阶乘时int越界
//    public int climbStairs(int n) {
//        int pOne = n;
//        int pTwo = 0;
//
//        int res = 0;
//        while (pOne >= 0) {
//            if (pOne == 0 || pTwo == 0) {
//                res += 1;
//            } else {
//                res += factorial(pTwo + 1, pOne, true) / factorial(pOne, pOne, false);
//            }
//            pOne -= 2;
//            pTwo += 1;
//        }
//        return res;
//    }
//
//    private static long factorial(int x, int count, boolean isAdd) {
//        long res = 1;
//        if (isAdd) {
//            while (count-- > 0) {
//                res = res * x++;
//            }
//        } else {
//            while (count-- > 0) {
//                res = res * x--;
//            }
//        }
//        return res;
//    }


    //comb重复次数太多 timeout
//    public int climbStairs(int n) {
//        int stepOne = n;
//        int stepTwo = 0;
//
//        int count = 0;
//
//        while (stepOne >= 0) {
//            count += comb(stepOne, stepTwo);
//            stepOne -= 2;
//            stepTwo += 1;
//        }
//
//        return count;
//    }
//
//    private static int comb(int stepOne, int stepTwo) {
//        if (stepOne == 0 || stepTwo == 0) {
//            return 1;
//        }
//        int count = 0;
//        count += comb(stepOne - 1, stepTwo);
//        count += comb(stepOne, stepTwo - 1);
//        return count;
//    }

}
