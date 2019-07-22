package v1;

import org.junit.jupiter.api.Test;
import v1.T821;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T821Test {
    T821 t = new T821();

    @Test
    public void test_case_1(){
        String S = "loveleetcode";
        String C = "e";
        int[] res = t.shortestToChar(S, C);
        int[] expected = new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(res));
    }

}