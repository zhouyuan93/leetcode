package v1.t400;

public class T427 {
    public static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    public Node construct(int[][] grid) {
        if (grid.length == 0) {
            return new Node(false, false, null, null, null, null);
        }

        return trans(grid, 0, 0, grid.length);

    }

    public Node trans(int[][] grid, int x, int y, int len) {

        boolean isLeaf = validateIsLeaf(grid, x, y, len);

        Node topLeft = null;
        Node topRight = null;
        Node bottomLeft = null;
        Node bottomRight = null;

        if (isLeaf) {
            int half = len / 2;
            topLeft = trans(grid, x, y, half);
            topRight = trans(grid, x + half, y, half);
            bottomLeft = trans(grid, x, y + half, half);
            bottomRight = trans(grid, x + half, y + half, half);
        } else {
            topLeft = null;
            topRight = null;
            bottomLeft = null;
            bottomRight = null;
        }

        return new Node(grid[y][x] == 1, isLeaf, topLeft, topRight, bottomLeft, bottomRight);
    }

    private boolean validateIsLeaf(int[][] grid, int x, int y, int len) {
        if (len <= 1) {
            return true;
        }
        int t = grid[y][x];
        for (int i = x; i < x + len; i++) {
            for (int j = y; j < y + len; j++) {
                if (grid[j][i] != t) {
                    return false;
                }
            }
        }
        return true;
    }

}
