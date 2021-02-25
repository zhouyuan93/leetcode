package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST16_19Test {

    MST16_19 t;

    @BeforeEach
    void setUp() {
        t = new MST16_19();
    }

    @Test
    void test_1() {
        int[][] land = {
                {0, 2, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 1, 0, 1}
        };
        int[] actual = t.pondSizes(land);
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, actual);
    }
}
