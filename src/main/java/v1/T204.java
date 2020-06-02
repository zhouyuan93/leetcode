package v1;

/**
 * @author yuan.zhou
 */
public class T204 {
    public int countPrimes(int n) {
        boolean[] memory = new boolean[n];

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (memory[i-1] == false) {
                count += 1;
                int p = i+i;
                while (p <= n) {
                    memory[p-1] = true;
                    p += i;
                }
            }
        }

        return count;

    }
}
