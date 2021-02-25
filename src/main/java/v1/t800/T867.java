package v1.t800;

/**
 * @author yuan.zhou
 */
public class T867 {
    public int[][] transpose(int[][] matrix) {
        int yLen = matrix.length;
        int xLen = matrix[0].length;

        int[][] res = new int[matrix[0].length][matrix.length];

        for (int y = 0; y < yLen; y++) {
            for (int x = 0; x < xLen; x++) {
                res[x][y] = matrix[y][x];
            }
        }

        return res;
    }
}
