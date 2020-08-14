package v1.t700;

/**
 * @author yuan.zhou
 */
public class T717 {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length > 2 && bits[bits.length - 2] == 0) {
            return true;
        }
        int i = 0;
        while (i < bits.length - 1) {
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }
}
