package v1.t900;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author yuan.zhou
 */
public class T937 {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt((point -> (int) (Math.pow(point[0], 2) + Math.pow(point[1], 2)))));
        return Arrays.copyOf(points, K);
    }
}
