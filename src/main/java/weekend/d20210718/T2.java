package weekend.d20210718;

public class T2 {
    public int addRungs(int[] rungs, int d) {
        int res = 0;
        int x = 0;
        for (int rung : rungs) {
            int t = rung - x - d;
            if (t <= 0) {
                x = rung;
                continue;
            }else{
                res += (rung - x) / d - 1;
                if ((rung - x) % d > 0) {
                    res++;
                }
                x = rung;
            }
        }
        return res;

    }
}
