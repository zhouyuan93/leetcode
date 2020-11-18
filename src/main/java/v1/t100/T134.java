package v1.t100;

/**
 * @author yuan.zhou
 */
public class T134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < cost.length; i++) {
            cost[i] = cost[i] - gas[i];
            gas[i] = 0;
        }

        for (int start = 0; start < cost.length; start++) {
            int cSum = 0;
            boolean flag = true;
            for (int i = 0; i < cost.length; i++) {
                int p = start + i;
                if (p >= cost.length) {
                    p -= cost.length;
                }
                cSum += cost[p];
                if (0 < cSum) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return start;
            }
        }
        return -1;
    }
}
