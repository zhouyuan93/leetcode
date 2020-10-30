package v1.t1100;

/**
 * @author yuan.zhou
 */
public class T1138 {
    public static final int[][] BOARD = {
            {0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 4},
            {1, 0}, {1, 1}, {1, 2}, {1, 3}, {1, 4},
            {2, 0}, {2, 1}, {2, 2}, {2, 3}, {2, 4},
            {3, 0}, {3, 1}, {3, 2}, {3, 3}, {3, 4},
            {4, 0}, {4, 1}, {4, 2}, {4, 3}, {4, 4},
            {5, 0}
    };

    public String alphabetBoardPath(String target) {
        int p = 0;
        char[] chars = target.toCharArray();

        StringBuilder res = new StringBuilder();
        for (char aChar : chars) {
            int c = aChar - 'a';

            if (p != c && p == 'z' - 'a') {
                res.append('U');
                p = 'u' - 'a';
            }
            int x = BOARD[p][1] - BOARD[c][1];
            int y = BOARD[p][0] - BOARD[c][0];

            for (int i = 0; i < x; i++) {
                res.append('L');
            }
            for (int i = x; i < 0; i++) {
                res.append('R');
            }
            for (int i = 0; i < y; i++) {
                res.append('U');
            }
            for (int i = y; i < 0; i++) {
                res.append('D');
            }
            p = c;
            res.append("!");
        }

        return res.toString();

    }
}
