package v1.t1700;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T1738 {
    public int kthLargestValue(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, Comparator.comparingInt(a -> a));

        queue.add(matrix[0][0]);
        for (int j = 1; j < matrix[0].length; j++) {
            matrix[0][j] ^= matrix[0][j - 1];
            if (queue.size() < k) {
                queue.add(matrix[0][j]);
            } else {
                if (matrix[0][j] > queue.peek()) {
                    queue.poll();
                    queue.add(matrix[0][j]);
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum ^= matrix[i][j];
                matrix[i][j] = sum ^ matrix[i - 1][j];
                if (queue.size() < k) {
                    queue.add(matrix[i][j]);
                } else {
                    if (matrix[i][j] > queue.peek()) {
                        queue.poll();
                        queue.add(matrix[i][j]);
                    }
                }
            }
        }

        return queue.poll();

    }
}
