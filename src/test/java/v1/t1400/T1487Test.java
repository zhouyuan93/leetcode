package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1487Test {

    T1487 t;

    @BeforeEach
    void setUp() {
        t = new T1487();
    }

    @Test
    void test_1() {
        String[] names = new String[]{"onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece"};
        String[] actual = t.getFolderNames(names);
        String[] expected = new String[]{"onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece(4)"};
        assertArrayEquals(expected,actual);
    }

    @Test
    void test_2() {
        String[] names = new String[]{"kaido","kaido(1)","kaido","kaido(1)"};
        String[] actual = t.getFolderNames(names);
        String[] expected = new String[]{"kaido","kaido(1)","kaido(2)","kaido(1)(1)"};
        assertArrayEquals(expected,actual);
    }
}