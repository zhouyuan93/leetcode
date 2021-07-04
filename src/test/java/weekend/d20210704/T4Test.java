package weekend.d20210704;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T4Test {

    T4 t = new T4();

    @Test
    void ts() {
        int n = 5;
        int[][] p = {{0, 1, 2, 3, 4},
                {4, 3, 2, 1, 0}};
        int a = t.longestCommonSubpath(n, p);
        System.out.println(a);
    }
}