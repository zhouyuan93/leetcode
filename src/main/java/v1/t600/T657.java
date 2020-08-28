package v1.t600;

/**
 * @author yuan.zhou
 */
public class T657 {
    public boolean judgeCircle(String moves) {
        char[] sc = moves.toCharArray();
        int x = 0 ;
        int y = 0;
        for (char c : sc) {
            switch (c) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                default:
            }
        }
        return x == 0 && y == 0;
    }
}
