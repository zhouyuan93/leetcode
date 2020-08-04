package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t800.T881;

import static org.junit.jupiter.api.Assertions.*;

class T881Test {
    T881 t;

    @BeforeEach
    void setUp() {
        t = new T881();
    }

    @Test
    void test_1() {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        int actual = t.numRescueBoats(people, limit);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] people = {3, 2, 2, 2, 2, 2, 2, 1};
        int limit = 3;
        int actual = t.numRescueBoats(people, limit);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] people = {1,2};
        int limit = 3;
        int actual = t.numRescueBoats(people, limit);
        int expected = 1;
        assertEquals(expected, actual);
    }
}