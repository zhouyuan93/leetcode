package v1.t200;

/**
 * @author yuan.zhou
 */
public class T240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length==0){
            return false;
        }

        int x = 0;
        int y = 0;
        int yLen = matrix.length-1;
        int xLen = matrix[0].length-1;

        return searchMatrix(matrix, target, x, y , xLen, yLen);

    }

    public boolean searchMatrix(int[][] matrix, int target, int x, int y, int xLen, int yLen) {
        //缩减y的长度
        boolean change = true;
        int iMax = y + yLen;
        for (int i = y; i <= iMax; i++) {
            int min = matrix[i][x];
            int max = matrix[i][x + xLen];
            if (min == target || max == target) {
                return true;
            }
            if (min < target && max > target) {
                change = false;
            }else{
                if (change) {
                    y++;
                    yLen--;
                }else{
                    yLen-= iMax - i + 1;
                    break;
                }
            }
        }

        if (yLen < 0) {
            return false;
        }

        //缩减x的长度
        iMax = x + xLen;
        change = true;
        for (int i = x; i <= iMax; i++) {
            int min = matrix[y][i];
            int max = matrix[y + yLen][i];
            if (min == target || max == target) {
                return true;
            }
            if (min < target && max > target) {
                change = false;
            }else{
                if (change) {
                    x++;
                    xLen--;
                }else{
                    xLen -= iMax - i + 1;
                    break;
                }
            }
        }

        if (xLen < 0) {
            return false;
        }

        return searchMatrix(matrix, target, x, y , xLen, yLen);

    }
}
