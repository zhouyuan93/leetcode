package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T949Test {

    T949 t;

    @BeforeEach
    void setUp() {
        t = new T949();
    }

    @Test
    void test_1() {
        int[] arr = {5, 5, 5, 5};
        String actual = t.largestTimeFromDigits(arr);
        String expected = "";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] arr = {0,0,1,0};
        String actual = t.largestTimeFromDigits(arr);
        String expected = "10:00";
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] arr = {1,2,3,4};
        String actual = t.largestTimeFromDigits(arr);
        String expected = "23:41";
        assertEquals(expected,actual);
    }
}