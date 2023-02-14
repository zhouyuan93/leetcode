package v1.t1100;

public class T1124 {
    public int longestWPI(int[] hours) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] > 8) {
                count++;
            }
            hours[i] = count;
        }
        int len = hours.length;
        while (len > 0) {
            int half = len / 2;
            for (int i = -1, j = len - 1; j < hours.length; i++, j++) {
                if (i == -1) {
                    if (hours[j] > half) {
                        return len;
                    }
                } else if (hours[j] - hours[i] > half) {
                    return len;
                }
            }
            len--;
        }
        return 0;
    }
}
