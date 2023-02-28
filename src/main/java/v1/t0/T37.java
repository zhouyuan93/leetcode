package v1.t0;

import java.util.*;

public class T37 {
    private class Node {
        int x, y, z;

        public Node(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static final int FULL = (1 << 9) - 1;

    public void solveSudoku(char[][] board) {
        int[] setX = new int[9];
        int[] setY = new int[9];
        int[] setZ = new int[9];

        Arrays.fill(setX, FULL);
        Arrays.fill(setY, FULL);
        Arrays.fill(setZ, FULL);

        List<Node> list = new ArrayList();
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {
                int i = FULL - (1 << (board[y][x] - '1'));
                int z = y / 3 * 3 + x / 3;
                if (board[y][x] != '.') {
                    setX[x] &= i;
                    setY[y] &= i;
                    setZ[z] &= i;
                } else {
                    list.add(new Node(x, y, z));
                }
            }
        }

        Queue<Node> emptyQueue = new PriorityQueue<>(Comparator.comparingInt(n -> mergeSetsSize(setX[n.x],setY[n.y],setZ[n.z])));
        for (Node node : list) {
            emptyQueue.offer(node);
        }

        if (emptyQueue.isEmpty()) {
            return;
        }

        Node node = emptyQueue.poll();
        dfs(board, node, emptyQueue, setX, setY, setZ);

    }

    private boolean dfs(char[][] board, Node node, Queue<Node> emptyQueue,
                        int[] setX, int[] setY, int[] setZ) {
        Set<Character> t = mergeSets(setX[node.x], setY[node.y], setZ[node.z]);

        for (Character c : t) {
            board[node.y][node.x] = c;
            int i = FULL - (1 << (c - '1'));
            setX[node.x] &= i;
            setY[node.y] &= i;
            setZ[node.z] &= i;

            if (emptyQueue.isEmpty()) {
                return true;
            }

            Node n = emptyQueue.poll();
            if (dfs(board, n, emptyQueue, setX, setY, setZ)) {
                return true;
            }

            emptyQueue.offer(n);
            board[node.y][node.x] = '.';
            i = 1 << (c - '1');
            setX[node.x] |= i;
            setY[node.y] |= i;
            setZ[node.z] |= i;
        }

        return false;
    }

    private Set<Character> mergeSets(int setX, int setY, int setZ) {
        int t = setX & setY & setZ;
        Set<Character> res = new HashSet<>();
        if (t == 0) {
            return res;
        }
        for (int i = 0; i < 9; i++) {
            if ((t & (1 << i)) > 0) {
                res.add((char) ('1' + i));
            }
        }

        return res;
    }

    private int mergeSetsSize(int setX, int setY, int setZ) {
        int t = setX & setY & setZ;
        return (t & 1) + (t >> 1 & 1)
                + (t >> 2 & 1)
                + (t >> 3 & 1)
                + (t >> 4 & 1)
                + (t >> 5 & 1)
                + (t >> 6 & 1)
                + (t >> 7 & 1)
                + (t >> 8 & 1);
    }
}
