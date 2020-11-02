package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T539Test {
    T539 t;

    @BeforeEach
    void setUp() {
        t = new T539();
    }

    @Test
    void test_1() {
        List<String> timePoints = Arrays.asList("23:59", "00:00");
        int actual = t.findMinDifference(timePoints);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        List<String> timePoints = Arrays.asList("00:00","23:59","00:00");
        int actual = t.findMinDifference(timePoints);
        int expected = 0;
        assertEquals(expected, actual);
    }
}