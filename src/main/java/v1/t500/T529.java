package v1.t500;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T529 {
    public char[][] updateBoard(char[][] board, int[] click) {

        updateOneStepBoard(board, click);

        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
        }

        return board;

    }

    public void updateOneStepBoard(char[][] board, int[] click) {

        char c = board[click[0]][click[1]];

        if (c != 'E') {
            return;
        }


        int x = click[1];
        int y = click[0];

        int count = 0;
        for (int i = -1; i < 2; i++) {
            if (board.length <= y + i || y + i < 0) {
                continue;
            }
            for (int j = -1; j < 2; j++) {
                if (board[0].length <= x + j || x + j < 0) {
                    continue;
                }
                if (i == 0 && j == 0) {
                    continue;
                }
                if (board[y + i][x + j] == 'M') {
                    count++;
                }
            }
        }

        if (count > 0) {
            board[y][x] = Character.forDigit(count, 10);
        } else {
            board[y][x] = 'B';
            for (int i = -1; i < 2; i++) {
                if (board.length <= y + i || y + i < 0) {
                    continue;
                }
                for (int j = -1; j < 2; j++) {
                    if (board[0].length <= x + j || x + j < 0) {
                        continue;
                    }
                    if (i == 0 && j == 0) {
                        continue;
                    }
                    updateOneStepBoard(board, new int[]{y + i, x + j});
                }
            }
        }

    }


}
