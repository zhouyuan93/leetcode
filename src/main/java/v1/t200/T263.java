package v1.t200;

/**
 * @author yuan.zhou
 */
public class T263 {
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        //除2
        while ((num & 1) == 0) {
            num >>= 1;
        }
        //除3
        while (num % 3 == 0) {
            num /= 3;
        }
        //除5
        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1;

    }
}
