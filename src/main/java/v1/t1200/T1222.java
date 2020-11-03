package v1.t1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T1222 {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[] north = null;
        int[] south = null;
        int[] east = null;
        int[] west = null;
        int[] eastNorth = null;
        int[] eastSouth = null;
        int[] westNorth = null;
        int[] westSouth = null;

        int ky = king[0];
        int kx = king[1];
        for (int[] queen : queens) {
            int qy = queen[0];
            int qx = queen[1];
            //north
            if (kx == qx && ky < qy) {
                if (north == null) {
                    north = new int[]{qy, qx};
                }else{
                    north[0] = Math.min(qy, north[0]);
                }
            }
            //south
            if (kx == qx && ky > qy) {
                if (south == null) {
                    south = new int[]{qy, qx};
                }else{
                    south[0] = Math.max(qy, south[0]);
                }
            }
            //east
            if (kx < qx && ky == qy) {
                if (east == null) {
                    east = new int[]{qy, qx};
                }else{
                    east[1] = Math.min(qx, east[1]);
                }
            }
            //west
            if (kx > qx && ky == qy) {
                if (west == null) {
                    west = new int[]{qy, qx};
                }else{
                    west[1] = Math.max(qx, west[1]);
                }
            }
            int dx = Math.abs(kx - qx);
            int dy = Math.abs(ky - qy);
            if (dx != dy) {
                continue;
            }
            //east North
            if (kx < qx && ky < qy) {
                if (eastNorth == null) {
                    eastNorth = new int[]{qy, qx};
                }else{
                    if (dx < Math.abs(eastNorth[0] - ky)) {
                        eastNorth[0] = qy;
                        eastNorth[1] = qx;
                    }
                }
            }
            //east south
            if (kx < qx && ky > qy) {
                if (eastSouth == null) {
                    eastSouth = new int[]{qy, qx};
                }else{
                    if (dx < Math.abs(eastSouth[0] - ky)) {
                        eastSouth[0] = qy;
                        eastSouth[1] = qx;
                    }
                }
            }
            //west north
            if (kx > qx && ky < qy) {
                if (westNorth == null) {
                    westNorth = new int[]{qy, qx};
                }else{
                    if (dx < Math.abs(westNorth[0] - ky)) {
                        westNorth[0] = qy;
                        westNorth[1] = qx;
                    }
                }
            }
            //west south
            if (kx > qx && ky > qy) {
                if (westSouth == null) {
                    westSouth = new int[]{qy, qx};
                }else{
                    if (dx < Math.abs(westSouth[0] - ky)) {
                        westSouth[0] = qy;
                        westSouth[1] = qx;
                    }
                }
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        if (north != null) {
            res.add(Arrays.asList(north[0],north[1]));
        }
        if (east != null) {
            res.add(Arrays.asList(east[0],east[1]));
        }
        if (south != null) {
            res.add(Arrays.asList(south[0],south[1]));
        }
        if (west != null) {
            res.add(Arrays.asList(west[0],west[1]));
        }
        if (eastNorth != null) {
            res.add(Arrays.asList(eastNorth[0],eastNorth[1]));
        }
        if (eastSouth != null) {
            res.add(Arrays.asList(eastSouth[0],eastSouth[1]));
        }
        if (westNorth != null) {
            res.add(Arrays.asList(westNorth[0],westNorth[1]));
        }
        if (westSouth != null) {
            res.add(Arrays.asList(westSouth[0],westSouth[1]));
        }
        return res;

    }
}
