package v1.t1700;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class T1738 {
    public int kthLargestValue(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(matrix[0][0]);
        for (int j = 1; j < matrix[0].length; j++) {
            matrix[0][j] ^= matrix[0][j-1];
            queue.add(matrix[0][j]);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum ^= matrix[i][j];
                matrix[i][j] = sum ^ matrix[i - 1][j];
                queue.add(matrix[i][j]);
                if (queue.size() > k) {
                    queue.poll();
                }
            }
        }

        return queue.poll();

    }
}
