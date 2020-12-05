package v1.t600;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T621 {

    public int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length < 1) {
            return 0;
        }
        if (tasks.length == 1) {
            return 1;
        }


        int[] memory = new int[26];

        for (char c : tasks) {
            memory[c - 'A']++;
        }

        Arrays.sort(memory);

        int lastLen = memory[memory.length - 1];
        int minUsed = (lastLen - 1) * (n + 1) + 1;
        int used = lastLen;

        for (int i = memory.length - 2; i >= 0; i--) {
            if (memory[i] == 0) {
                break;
            }
            used += memory[i];
            if (memory[i] == lastLen) {
                minUsed += 1;
            }
        }

        return Math.max(used, minUsed);

    }

}
