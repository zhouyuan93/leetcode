package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST16_15Test {
    MST16_15 t;

    @BeforeEach
    void setUp() {
        t = new MST16_15();
    }

    @Test
    void test_1() {
        String solution = "RGBY";
        String guess = "GGRR";
        int[] actual = t.masterMind(solution, guess);
        int[] expected = {1, 1};
        assertArrayEquals(expected, actual);
    }
}