package v1;

/**
 * @author yuan.zhou
 */
public class T168 {
    public String convertToTitle(int n) {
        n -= 1;
        StringBuilder sb = new StringBuilder();
        int y = n;
        char x = 0;
        while (y != -1) {
            x = (char) (y % 26 + 65);
            y = y / 26 - 1;
            sb.insert(0, x);
        }
        return sb.toString();
    }
}
