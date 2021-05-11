package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1743Test {

    T1743 t;

    @BeforeEach
    void setUp() {
        t = new T1743();
    }

    @Test
    void test_1() {
        int[] encoding = {6, 5, 4, 6};
        int[] actual = t.decode(encoding);
        int[] expected = {2, 4, 1, 5, 3};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}