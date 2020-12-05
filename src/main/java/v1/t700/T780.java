package v1.t700;

/**
 * @author yuan.zhou
 */
public class T780 {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (sx != tx || sy != ty) {
            if (tx < sx || ty < sy) {
                return false;
            }

            int i = 0;
            if (tx == ty) {
                return false;
            } else if (tx < ty) {
                 i = (ty-sy) / tx;
                ty = ty - tx * i;
            } else {
                 i = (tx-sx) / ty;
                tx = tx - ty * i;
            }

            if (i == 0) {
                return false;
            }
        }
        return true;

    }
}
