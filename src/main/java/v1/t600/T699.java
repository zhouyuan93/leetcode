package v1.t600;

import sun.nio.cs.ext.MacHebrew;

import java.util.ArrayList;
import java.util.List;

public class T699 {

    private List<int[]> height = new ArrayList<>();
    private List<Integer> res = new ArrayList<>();

    public List<Integer> fallingSquares(int[][] positions) {
        if (positions.length == 0) {
            return res;
        }

        int len = positions.length;

        int x = positions[0][0];
        int side = positions[0][1];
        height.add(new int[]{-1, 0});
        height.add(new int[]{x, side});
        height.add(new int[]{x + side, 0});
        res.add(side);

        int max = side;

        // 逐个放置
        for (int i = 1; i < len; i++) {
            x = positions[i][0];
            side = positions[i][1];
            int end = x + side - 1;

            int p = findITT(x);

            // 比右边界大
            if (p == -1) {
                height.add(new int[]{x, side});
                height.add(new int[]{x + side, 0});
                max = Math.max(max, side);
                res.add(max);
                continue;
            }

            // l ~ end 找最大值 h
            int h = 0;
            // 如果lNode[0] < x, 再往前找一个节点
            if (height.get(p)[0] != x) {
                h = height.get(p - 1)[1];
            }
            int[] pNode = height.get(p);
            while(p < height.size() && height.get(p)[0] <= end ){
                pNode = height.get(p);
                h = Math.max(h, pNode[1]);
                height.remove(p);
            }
            if(pNode[0] > end){
                pNode = height.get(p - 1);
            }

            // 插入尾节点
            height.add(p, new int[]{x + side, pNode[1]});

            // 新高度
            h += side;

            // 将新头节点插入
            height.add(p, new int[]{x, h});

            // 获取当前最高高度
            max = Math.max(max, h);
            res.add(max);
        }

        return res;
    }

    public int findITT(int x) {
        int l = 0;
        int r = height.size();
        int mid;
        if (height.get(r - 1)[0] < x) {
            return -1;
        }

        while (r > l) {
            mid = (l + r) / 2;
            int t = height.get(mid)[0];
            if (t < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;
    }

}
