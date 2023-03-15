package v1.t1600;

public class T1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] city = new int[n];
        int[][] ctc = new int[n][n];

        for (int[] road : roads) {
            city[road[0]]++;
            city[road[1]]++;
            if (road[0] < road[1]) {
                ctc[road[0]][road[1]] = -1;
            }else{
                ctc[road[1]][road[0]] = -1;
            }
        }

        int res = 0;
        for (int i = 0; i < city.length; i++) {
            for (int j = i+1; j < city.length; j++) {
                res = Math.max(res, city[i] + city[j] + ctc[i][j]);
            }
        }

        return res;
    }
}
