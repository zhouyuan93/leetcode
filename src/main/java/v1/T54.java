package v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        int pLeft = 0;
        int pRight = matrix[0].length - 1;
        int pLow = 0;
        int pHeight = matrix.length - 1;

        int state = 0;

        List<Integer> res = new ArrayList<>();

        int x = 0;
        int y = 0;
        for (int p = 0; p < matrix[0].length * matrix.length; p++) {
            res.add(matrix[y][x]);
            switch (state) {
                case 0:
                    if (x == pRight) {
                        pLow++;
                        y++;
                        state = 1;
                    }else{
                        x++;
                    }
                    break;
                case 1:
                    if (y == pHeight) {
                        pRight--;
                        x--;
                        state = 2;
                    }else{
                        y++;
                    }
                    break;
                case 2:
                    if (x == pLeft) {
                        pHeight--;
                        y--;
                        state = 3;
                    }else{
                        x--;
                    }
                    break;
                case 3:
                    if (y == pLow) {
                        pLeft ++;
                        x++;
                        state = 0;
                    }else{
                        y--;
                    }
                    break;
                default:
                    throw new RuntimeException("wrong state type");
            }
        }

        return res;
    }
}
