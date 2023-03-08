package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T64Test {

    private T66 t;

    @BeforeEach
    void setUp() {
        t = new T66();
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