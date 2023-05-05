package v1.t2400;

import java.sql.Time;
import java.util.Arrays;
import java.util.Comparator;

public class T2432 {
    public int hardestWorker(int n, int[][] logs) {
        int time = 0;
        int max = 0;
        int res = 0;
        for (int i = 0; i < logs.length; i++) {
            int[] log = logs[i];

            int staff = log[0];
            int end = log[1];
            int temp = end - time;
            if (temp > max) {
                res =staff;
                max = temp;
            } else if (temp == max && staff < res) {
                res = staff;
            }

            time = end;
        }

        return res;

    }
}
