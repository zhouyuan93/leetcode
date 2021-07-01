package v1.jz;

public class JZ04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int x = 0;
        int y = matrix.length - 1;

        int xMax = matrix[0].length;
        while (x < xMax && y >= 0) {
            int t = matrix[y][x];
            if (t > target) {
                y--;
            } else if (t < target) {
                x++;
            } else {
                return true;
            }

        }

        return false;
    }
}
