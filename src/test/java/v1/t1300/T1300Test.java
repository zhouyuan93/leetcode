package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1300Test {
    T1300 t;

    @BeforeEach
    void setUp() {
        t = new T1300();
    }

    @Test
    void test_1() {
        int[] arr = {2, 3, 5};
        int target = 10;
        int actual = t.findBestValue(arr, target);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] arr = {4,9,3};
        int target = 10;
        int actual = t.findBestValue(arr, target);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] arr = {60864,25176,27249,21296,20204};
        int target = 56803;
        int actual = t.findBestValue(arr, target);
        int expected = 11361;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] arr = {1547,83230,57084,93444,70879};
        int target = 71237;
        int actual = t.findBestValue(arr, target);
        int expected = 17422;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int[] arr = {60864,25176,27249,21296,20204};
        int target = 56803;
        int actual = t.findBestValue(arr, target);
        int expected = 11361;
        assertEquals(expected,actual);
    }
}