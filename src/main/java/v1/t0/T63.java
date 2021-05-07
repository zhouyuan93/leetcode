package v1.t0;

public class T63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1) {
            return 0;
        }
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = -1;
                    continue;
                }

                if (i == 0) {
                    if (j == 0) {
                        obstacleGrid[0][0] = 1;
                        continue;
                    }

                    if (obstacleGrid[i][j - 1] > 0) {
                        obstacleGrid[i][j] = obstacleGrid[i][j - 1];
                    }
                    continue;
                }

                if (j == 0 ) {
                    if (obstacleGrid[i - 1][j] > 0) {
                        obstacleGrid[i][j] = obstacleGrid[i - 1][j];
                    }
                    continue;
                }


                if (obstacleGrid[i][j - 1] > 0) {
                    obstacleGrid[i][j] += obstacleGrid[i][j - 1];
                }
                if (obstacleGrid[i - 1][j] > 0) {
                    obstacleGrid[i][j] += obstacleGrid[i - 1][j];
                }

            }
        }

        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
