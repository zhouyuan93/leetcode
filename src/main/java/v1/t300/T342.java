package v1.t300;

/**
 * @author yuan.zhou
 */
public class T342 {
    public boolean isPowerOfFour(int num) {
        return num > 0 && ((num & (num - 1)) == 0) && ((num & 0xaaaaaaaa) == 0);
    }
}
