package v1.t0;

public class T74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int r = m * n - 1;
        int l = 0;

        while (l < r) {
            int mid = (l + r) / 2;
            int y = mid / n;
            int x = mid % n;
            if (matrix[y][x] < target) {
                l = mid + 1;
            }else{
                r = mid;
            }
        }

        int y = l / n;
        int x = l % n;
        return matrix[y][x] == target;

    }

}
