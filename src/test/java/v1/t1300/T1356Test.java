package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1356Test {
    T1356 t;

    @BeforeEach
    void setUp() {
        t = new T1356();
    }

    @Test
    void test_1() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] actual = t.sortByBits(arr);
        int[] expected = {0, 1, 2, 4, 8, 3, 5, 6, 7};
        assertArrayEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
        int[] actual = t.sortByBits(arr);
        int[] expected = {1,2,4,8,16,32,64,128,256,512,1024};
        assertArrayEquals(expected,actual);
    }
}