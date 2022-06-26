package v1.t1300;

public class T1394 {
    public int findLucky(int[] arr) {
        int[] memo = new int[501];

        for (int x : arr) {
            memo[x]++;
        }

        for (int i = memo.length - 1; i >= 0; i--) {
            if (i == memo[i]) {
                return i;
            }
        }
        return -1;
    }
}
