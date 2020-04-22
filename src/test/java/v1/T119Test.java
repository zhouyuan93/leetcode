package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T119Test {

    private T119 t;

    @BeforeEach
    void setUp() {
        t = new T119();
    }

    @Test
    void test1() {
        List<Integer> actual = t.getRow(5);
        Integer[] except = new Integer[]{1, 4, 6, 4, 1};
        assertEquals(except.length,actual.size());
        for (int i = 0; i < except.length; i++) {
            assertEquals(except[i], actual.get(i));
        }
    }
}