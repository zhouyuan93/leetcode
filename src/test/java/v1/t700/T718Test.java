package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T718Test {

    T718 t;

    @BeforeEach
    void setUp() {
        t = new T718();
    }

    @Test
    void test_1() {
        int[] answers = {1, 1, 2};
        int actual = t.numRabbits(answers);
        int expected = 5;
        assertEquals(expected, actual);
    }
}