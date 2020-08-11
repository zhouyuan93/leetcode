package v1.t100;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T130 {
    public void solve(char[][] board) {
        if (board.length == 1) {
            return;
        }

        //所有边界0处理
        for (int j = 0; j < board.length; j+=board.length - 1) {
            for (int i = 0; i < board[0].length; i++) {
                findBordConnected(board, i, j);
            }
        }
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[0].length; i+=board[0].length - 1) {
                findBordConnected(board, i, j);
            }
        }

        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }

        //遍历,将'-'置换成'0','0'置换成'X'
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[0].length; i++) {
                if (board[j][i] == '-') {
                    board[j][i] = 'O';
                } else if (board[j][i] == 'O') {
                    board[j][i] = 'X';
                }
            }
        }
    }

    public void findBordConnected(char[][] board, int i, int j) {
        if (i < 0 || i >= board[0].length || j < 0 || j >= board.length) {
            return;
        }

        if (board[j][i] == 'O') {
            board[j][i] = '-';
            findBordConnected(board,i+1,j);
            findBordConnected(board,i-1,j);
            findBordConnected(board,i,j+1);
            findBordConnected(board,i,j-1);
        }

    }
}
