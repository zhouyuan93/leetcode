package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T354Test {

    T354 t;

    @BeforeEach
    void setUp() {
        t = new T354();
    }

    @Test
    void test_1() {
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        int actual = t.maxEnvelopes(envelopes);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] envelopes = {{30, 50}, {12, 2}, {3, 4}, {12, 15}};
        int actual = t.maxEnvelopes(envelopes);
        int expected = 3;
        assertEquals(expected, actual);
    }


}