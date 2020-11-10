package v1.mst;

/**
 * @author yuan.zhou
 */
public class MST16_15 {
    public int[] masterMind(String solution, String guess) {
        int[] sm = new int[4];
        int[] gm = new int[4];
        int[] res = {0, 0};
        for (int i = 0; i < solution.length(); i++) {
            char s = solution.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                res[0]++;
            }
            add(sm, s);
            add(gm, g);
        }
        for (int i = 0; i < sm.length; i++) {
            res[1] += Math.min(sm[i], gm[i]);
        }
        res[1] -= res[0];
        return res;
    }

    public void add(int[] m, char c) {
        switch (c) {
            case 'R':
                m[0]++;
                break;
            case 'G':
                m[1]++;
                break;
            case 'B':
                m[2]++;
                break;
            case 'Y':
                m[3]++;
                break;
            default:
                break;
        }
    }
}
