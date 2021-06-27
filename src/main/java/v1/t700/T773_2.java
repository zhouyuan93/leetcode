package v1.t700;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class T773_2 {

    int[] m = {1, 10, 100, 1000, 10000, 100000, 1000000};

    public int slidingPuzzle(int[][] _board) {

        Map<Integer, Integer> firstMap = new HashMap<>();
        firstMap.put(123450, 0);

        int target = 0;
        int zero = -1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                target = target * 10 + _board[i][j];
                if (_board[i][j] == 0) {
                    zero = (5 - i * 3 - j) * 1000000;
                }
            }
        }
        target += zero;

        if(target == 123450){
            return 0;
        }

        int firstStep = 1;
        Deque<Integer> firstDeque = new ArrayDeque<>();
        Deque<Integer> nextFirstDeque = new ArrayDeque<>();

        firstDeque.push(123450);

        while (!firstDeque.isEmpty()) {
            while (!firstDeque.isEmpty()) {
                int x = firstDeque.poll();
                Integer[] nextArray = move(x);
                for (Integer next : nextArray) {
                    if (next == null) {
                        continue;
                    }
                    if (next == target) {
                        return firstStep;
                    }
                    if (!firstMap.containsKey(next)) {
                        nextFirstDeque.add(next);
                        firstMap.put(next, firstStep);
                    }
                }
            }


            if (firstDeque.isEmpty() && !nextFirstDeque.isEmpty()) {
                firstStep++;
                firstDeque = nextFirstDeque;
                nextFirstDeque = new ArrayDeque<>();
            }


        }

        return -1;

    }

    public Integer[] move(int x) {
        Integer[] res = new Integer[4];
        int z = x / 1000000;
        int t = x % 1000000;

        // left
        if (z != 5 && z != 2) {
            res[0] = swap(t, z, +1);
        }

        // right
        if (z != 0 && z != 3) {
            res[1] = swap(t, z, -1);
        }

        // up
        if (z <= 2) {
            res[2] = swap(t, z, +3);
        }

        // down
        if (z >= 3) {
            res[2] = swap(t, z, -3);
        }

        return res;

    }

    public int swap(int t, int z, int move) {
        int p = t / m[z + move] % 10;
        int nextT = t - p * m[z + move] + p * m[z];
        return (z + move) * 1000000 + nextT;
    }

}
