package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t1400.T1441;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static v1.t1400.T1441.*;

class T1441Test {

    T1441 t;

    @BeforeEach
    void setUp() {
        t = new T1441();
    }

    @Test
    void test_1() {
        int[] target = {1, 3};
        int n = 3;
        List<String> actual = t.buildArray(target, n);
        List<String> expected = Arrays.asList(PUSH, PUSH, POP, PUSH);
        assertEquals(expected, actual);
    }
}