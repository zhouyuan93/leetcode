package v1.t800;

public class T868 {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int res = 0;
        int p = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (res < i - p) {
                    res = i -p;
                }
                p = i;
            }
        }
        return res;
    }
}
