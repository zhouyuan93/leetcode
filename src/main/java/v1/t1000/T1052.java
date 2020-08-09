package v1.t1000;

/**
 * @author yuan.zhou
 */
public class T1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {

        int sumCustomer = 0;
        int sumLostCustomer = 0;

        int lostCustomer = 0;
        for (int i = 0; i < X; i++) {
            sumCustomer += customers[i];
            lostCustomer += customers[i] * grumpy[i];
        }

        int maxLost = lostCustomer;

        sumLostCustomer += lostCustomer;

        for (int left = 0, i = X; i < grumpy.length; i++,left++) {
            sumCustomer += customers[i];

            int lostI = customers[i] * grumpy[i];
            sumLostCustomer += lostI;

            lostCustomer = lostCustomer + lostI - customers[left] * grumpy[left];
            maxLost = Math.max(lostCustomer, maxLost);

        }

        return sumCustomer - sumLostCustomer + maxLost;

    }
}
