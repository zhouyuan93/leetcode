package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T118;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T118Test {
    private T118 t;

    @BeforeEach
    void setUp() {
        t = new T118();
    }

    @Test
    void test_1() {
        List<List<Integer>> actual = t.generate(5);
        String actualStr = actual.toString();
        String exceptStr = "[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]";
        assertEquals(exceptStr,actualStr);
    }
}