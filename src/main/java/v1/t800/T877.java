package v1.t800;

public class T877 {
    public boolean stoneGame(int[] piles) {
        int[][] memo;
        memo = new int[piles.length][piles.length];

        for (int i = 0; i < piles.length; i++) {
            memo[i][i] = piles[i];
        }

        for (int len = 1; len < piles.length; len++) {
            for (int x = 0, y = x+len; y < piles.length; x++, y++) {
                int left = piles[x] - memo[x + 1][y];
                int right = piles[y] - memo[x][y - 1];
                memo[x][y] = Math.max(left, right);
            }
        }

        return memo[0][piles.length - 1] > 0;
    }
}
