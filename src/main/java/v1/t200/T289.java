package v1.t200;

/**
 * @author yuan.zhou
 */
public class T289 {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = getStatus(board, i, j);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] >>= 1;
            }
        }

    }

    public int getStatus(int[][] board, int y, int x) {
        int oldStatus = board[y][x] & 1;
        int count = 0;
        for (int i = -1; i < 2; i++) {
            int y1 = y + i;
            if (y1 < 0 || y1 >= board.length) {
                continue;
            }
            for (int j = -1; j < 2; j++) {
                int x1 = x + j;
                if (x1 < 0 || x1 >= board[0].length) {
                    continue;
                }
                if (i == 0 && j == 0) {
                    continue;
                }
                if ((board[y1][x1] & 1) == 1) {
                    count++;
                }
            }
        }
        if (oldStatus == 0 && count == 3) {
            return 2;
        }
        if (count == 3 || (count == 2 && oldStatus != 0)) {
            return 2 + oldStatus;
        }
        return oldStatus;
    }
}
