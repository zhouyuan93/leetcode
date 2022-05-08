package weekend.d20220508;

public class T4 {
    char[][] g;
    int max;
    int m ;
    int n ;
    Boolean[][][] memory;
    public boolean hasValidPath(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        max = m + n - 1;
        if ((max & 1) == 1 || grid[m-1][n-1] == '(') {
            return false;
        }
        max /= 2;

        memory = new Boolean[m][n][max + 1];
        g = grid;

        boolean calc = calc(0, 0, 0);


        return calc ;
    }

    public boolean calc(int x, int y, int target) {
        int t = g[y][x] == '(' ? 1 : -1;

        target += t;

        if(x == n-1 && y == m -1 && target == 0){
            return true;
        }
        if (target < 0 || target > max) {
            return false;
        }

        if (memory[y][x][target] != null) {
            return memory[y][x][target];
        }


        if (x + 1 < n) {
            boolean v = calc(x + 1, y, target);
            if (v) {
                memory[y][x][target] = true;
                return true;
            }
        }

        if (y + 1 < m) {
            boolean v = calc(x, y + 1, target);
            if(v){
                memory[y][x][target] = true;
                return true;
            }
        }

        memory[y][x][target] = false;
        return false;
    }
}
