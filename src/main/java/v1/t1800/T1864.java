package v1.t1800;

public class T1864 {
    public int minSwaps(String s) {
        int res1 = 0;
        int res0 = 0;

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            boolean isJi = i % 2 == 0;
            if (c == '0') {
                count0++;
                if (isJi) {
                    res1++;
                }
            } else {
                count1++;
                if (isJi) {
                    res0++;
                }
            }
        }

        if (count0 == count1) {
            return Math.min(res0, res1);
        }

        if (Math.abs(count0 - count1) > 1) {
            return -1;
        }

        return count0 > count1 ? res0 : res1;

    }
}
