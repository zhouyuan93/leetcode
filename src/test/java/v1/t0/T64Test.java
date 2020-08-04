package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t0.T64;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T64Test {

    private T64 t;

    @BeforeEach
    void setUp() {
        t = new T64();
    }

    @Test
    void test2() {
        int[] digits = new int[]{9, 9, 9};
        int[] actual = t.plusOne(digits);
        int[] except = {1, 0, 0, 0};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(except, actual);
    }

    @Test
    void test1() {
        int[] digits = new int[]{1, 2, 3};
        int[] actual = t.plusOne(digits);
        int[] except = {1, 2, 4};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(except, actual);
    }
}