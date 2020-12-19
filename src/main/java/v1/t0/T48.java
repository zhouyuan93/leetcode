package v1.t0;

/**
 * @author yuan.zhou
 */
public class T48 {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        int x = 0;
        int len = matrix.length - 1;
        for (int y = 0; y < matrix.length / 2; y++) {
            for (int index = 0; index < len; index++) {
                fourImageChange(matrix, x,y,len ,index);
            }
            len-=2;
            x++;
        }

    }

    public void fourImageChange(int[][] matrix, int x, int y, int len, int index) {
        int temp = matrix[y][x + index];

        matrix[y][x + index] = matrix[y + len - index][x];
        matrix[y + len - index][x] = matrix[y + len][x + len - index];
        matrix[y + len][x + len - index] = matrix[y + index][x + len];
        matrix[y + index][x + len] = temp;
    }
}
