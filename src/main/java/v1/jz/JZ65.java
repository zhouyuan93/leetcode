package v1.jz;

public class JZ65 {
    public int add(int a, int b) {
        int x = a ^ b;
        int y = (a & b) << 1;

        while (y != 0) {
            a = x;
            b = y;
            x = a ^ b;
            y = (a & b) << 1;
        }

        return x;
    }
}
