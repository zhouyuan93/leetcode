package v1.t400;

/**
 * @author yuan.zhou
 */
public class T476 {

    public int findComplement(int num) {
        int res = 0;
        int left = 0;
        while (num != 0) {
            res += (num % 2 ^ 1) << left++;
            num /= 2;
        }
        return res;
    }


}
