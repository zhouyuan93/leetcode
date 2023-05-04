package v1.t2100;

public class T2106 {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int minPosition = Math.max(0, startPos - k);
        int maxPosition = startPos + k;
        int len = fruits.length;

        int res = 0;

        // 初始化最左边指针的位置, 并计算sum
        int l = -1;
        int lSum = 0;
        int i = 0;
        for (; i < fruits.length; i++) {
            if (fruits[i][0] < minPosition) {
                continue;
            }
            if (fruits[i][0] >= startPos) {
                break;
            }
            if (l == -1) {
                l = i;
            }
            lSum += fruits[i][1];
        }

        res = lSum;

        if (i == fruits.length) {
            return res;
        }

        int m = i;
        int rSum = 0;
        if (fruits[i][0] == startPos) {
            res += fruits[i][1];
            rSum += fruits[i][1];
            i++;
        }

        for (; i < fruits.length; i++) {
            if (fruits[i][0] > maxPosition) {
                break;
            }
            rSum += fruits[i][1];
            while (lSum > 0) {
                int d = fruits[i][0] - fruits[l][0];
                d = Math.min(d + startPos - fruits[l][0], d + fruits[i][0] - startPos);
                if (d <= k) {
                    res = Math.max(res, lSum + rSum);
                    break;
                }
                lSum -= fruits[l][1];
                l++;
            }
        }

        res = Math.max(res, rSum);

        return res;
    }
}
