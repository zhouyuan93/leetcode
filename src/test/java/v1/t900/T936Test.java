package v1.t900;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T936Test {

    T936 t = new T936();

    @Test
    void test_1() {
        String stamp = "abca";
        String target = "aabcaca";
        int[] actual = t.movesToStamp(stamp, target);
        System.out.println(Arrays.toString(actual));
    }
}