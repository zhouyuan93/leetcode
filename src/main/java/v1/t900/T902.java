package v1.t900;

/**
 * @author yuan.zhou
 */
public class T902 {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        if (digits == null || digits.length == 0) {
            return 0;
        }

        //digits 转换成boolean[]
        boolean[] contains = new boolean[10];
        for (String digit : digits) {
            contains[digit.charAt(0) - '0'] = true;
        }

        int nLen = String.valueOf(n).length();
        int res = atMostNGivenDigitSet(contains,digits.length,n,nLen);

        int count = 1;
        for (int i = 1; i < nLen; i++) {
            count *= digits.length;
            res += count;
        }

        return res;
    }

    public int atMostNGivenDigitSet(boolean[] contains, int digitsLen, int n, int nLen) {
        int res = 0;

        if (n == 0) {
            return 0;
        }

        if (nLen == 1) {
            for (int i = 1; i <= n; i++) {
                if (contains[i]) {
                    res++;
                }
            }
            return res;
        }

        //截取, 最高位限制, 低位0-9
        //第一位计算
        int first = (int) (n / Math.pow(10,nLen - 1));
        int firstSize = 0;
        for (int i = 1; i < first; i++) {
            if (contains[i]) {
                firstSize++;
            }
        }
        res += firstSize * Math.pow(digitsLen, nLen - 1);

        //最高位
        if (contains[first]) {
            res += atMostNGivenDigitSet(contains,digitsLen, (int) (n- (first * Math.pow(10,nLen-1))),nLen-1);
        }

        return res;
    }
}
