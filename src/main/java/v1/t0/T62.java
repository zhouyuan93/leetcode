package v1.t0;

public class T62 {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        int[][] memory = new int[n][m];
        memory[0][0] = 1;
        return getMemory(m - 1, n - 1, memory);
    }

    public int getMemory(int x, int y, int[][] memory) {
        if (x >= memory[0].length || y >= memory.length || x < 0 || y < 0) {
            return 0;
        }

        if (memory[y][x] == 0) {
            memory[y][x] = getMemory(x - 1, y, memory) + getMemory(x, y - 1, memory);
        }

        return memory[y][x];
    }

}
