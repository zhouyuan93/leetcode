package weekend.d20210704;

import java.util.Arrays;
import java.util.Comparator;

public class T2 {
    class Mon{
        int dist ;
        int speed;
        double mini;

        public Mon(int dist, int speed) {
            this.dist = dist;
            this.speed = speed;
            this.mini = dist / (double) speed;
        }
    }
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        Mon[] mons = new Mon[n];

        for (int i = 0; i < n; i++) {
            mons[i] = new Mon(dist[i], speed[i]);
        }

        Arrays.sort(mons, Comparator.comparingDouble(mon -> mon.mini));

        int i = 0;
        int p = 0;
        while (p < n) {
            if (mons[p].mini > i) {
                p++;
            }else{
                break;
            }

            i++;
        }

        return p;
    }
}
