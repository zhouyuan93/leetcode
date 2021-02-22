package v1.t700;

/**
 * @author yuan.zhou
 */
public class T766 {

    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return true;
        }
        int[] memory = matrix[0];
        int change = memory.length - 1;
        int len = memory.length;

        for (int i = 1; i < matrix.length; i++) {
            int[] validate = matrix[i];
            memory[change] = validate[0];

            int p = change;
            for (int x : validate) {
                if (memory[p] != x) {
                    return false;
                }
                p++;
                if (p >= len) {
                    p -= len;
                }
            }

            change--;
            if (change < 0) {
                change += len;
            }

        }

        return true;

    }

}
