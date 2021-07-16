package v1.t1700;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class T1765 {
    class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int[][] highestPeak(int[][] isWater) {
        Queue<Node>[] queues = new Queue[2];
        queues[0] = new LinkedList<>();
        queues[1] = new LinkedList<>();
        int p = 0;
        int q = 1;

        int xMax = isWater[0].length;
        int yMax = isWater.length;
        for (int i = 0; i < isWater.length; i++) {
            for (int j = 0; j < isWater[0].length; j++) {
                if (isWater[i][j] == 1) {
                    isWater[i][j] = 0;
                    queues[p].add(new Node(j, i));
                }else{
                    isWater[i][j] = -1;
                }
            }
        }

        int floor = 1;
        while (!queues[p].isEmpty()) {
            while (!queues[p].isEmpty()) {
                Node node = queues[p].poll();

                int x = node.x + 1;
                int y = node.y;
                if (x < xMax && isWater[y][x] == -1) {
                    queues[q].add(new Node(x, y));
                    isWater[y][x] = floor;
                }

                x -= 2;
                if (x >= 0 && isWater[y][x] == -1) {
                    queues[q].add(new Node(x, y));
                    isWater[y][x] = floor;
                }

                x+=1;
                y -= 1;
                if (y >= 0 && isWater[y][x] == -1) {
                    queues[q].add(new Node(x, y));
                    isWater[y][x] = floor;
                }

                y += 2;
                if (y < yMax && isWater[y][x] == -1) {
                    queues[q].add(new Node(x, y));
                    isWater[y][x] = floor;
                }



            }

            for (int[] ints : isWater) {
                System.out.println(Arrays.toString(ints));
            }
            System.out.println(" ");

            floor++;
            p ^= 1;
            q ^= 1;
        }

        return isWater;
    }
}
