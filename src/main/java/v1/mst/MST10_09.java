package v1.mst;

public class MST10_09 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int x = 0, y = matrix.length-1;
        int lx = matrix[0].length;
        int ly = matrix.length;

        while (x < lx && y < ly && x >= 0 && y >= 0) {
            int t = matrix[y][x];
            if (t == target) {
                return true;
            }else if (t > target) {
                y--;
            } else if (t < target) {
                x++;
            }
        }
        return false;

    }
}
