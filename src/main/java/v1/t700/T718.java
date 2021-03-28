package v1.t700;

import java.util.Arrays;

public class T718 {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int res = 0;
        int i = 0;
        int x;
        int count;
        while (i < answers.length) {
            x = answers[i];
            count = 0;
            while (i < answers.length && answers[i] == x) {
                count++;
                i++;
            }
            res += (count + x) / (x + 1) * (x + 1);
        }
        return res;
    }
}
