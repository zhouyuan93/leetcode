package v1.t0;

import java.util.Arrays;

public class T79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int len = word.length();
        int[][] used = new int[m][n];

        char c = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int r = getDp(board, i, j, len - 1, used, word, 0);
                if (r == 1) {
                    return true;
                }
            }
        }

        return false;
    }

    private int getDp(char[][] board, int x, int y, int z, int[][] used, String word, int p) {
        if (p == word.length()) {
            return 1;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || used[x][y] == 1) {
            return -1;
        }

        int res = -1;
        if (word.charAt(p) == board[x][y]) {
            used[x][y] = 1;
            if (getDp(board,  x + 1, y, z - 1, used, word, p + 1) == 1
                    || getDp(board,  x - 1, y, z - 1, used, word, p + 1) == 1
                    || getDp(board,  x, y + 1, z - 1, used, word, p + 1) == 1
                    || getDp(board,  x, y - 1, z - 1, used, word, p + 1) == 1) {
                res = 1;
            }
            used[x][y] = 0;
        }


        return res;
    }
}
