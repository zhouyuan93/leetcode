package weekend.d20210627;

public class T2 {
    int[][] grid;
    int[][] res;
    int y;
    int x;

    public int[][] rotateGrid(int[][] _grid, int k) {
        grid = _grid;
        y = grid.length;
        x = grid[0].length;

        int countLevel = Math.min(y, x) / 2;

        res = new int[y][x];

        int temp = k;
        for (int level = 0; level < countLevel; level++) {
            int row = x - 2 * level - 1;
            int cow = y - 2 * level - 1;
            int count = (row + cow) * 2;
            k %= count;
            int t = k;

            int py = level;
            int px = level;

            if (k > row) {
                k -= row;
                px += row;

                if (k > cow) {
                    k -= cow;
                    py += cow;

                    if (k > row) {
                        k -= row;
                        px -= row;
                        py -= k;
                    }else{
                        px -= k;
                    }

                }else{
                    py += k;
                }
            }else{
                px += k;
            }

            int ry= level;
            int rx = level;

            for (int i = 0; i < count; i++) {
                res[ry][rx] = grid[py][px];
                if (i < row) {
                    rx++;
                } else if (i < row + cow) {
                    ry++;
                } else if (i < 2 * row + cow){
                    rx--;
                }else{
                    ry--;
                }

                if (t < row) {
                    px++;
                } else if (t < row + cow) {
                    py++;
                } else if (t < 2 * row + cow){
                    px--;
                }else{
                    py--;
                }
                t++;
                t %= count;

            }


            k = temp;
        }

        return res;
    }


}
