package v1.t300;

/**
 * @author yuan.zhou
 */
public class T371 {
    public int getSum(int a, int b) {
        int res = a ^ b;
        int temp = a & b;
        return temp == 0 ? res : getSum(res, temp << 1);
    }
}
