package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T922Test {

    T922 t;

    @BeforeEach
    void setUp() {
        t = new T922();
    }

    @Test
    void test_1() {
        int[] nums = {4, 2, 5, 7};
        int[] actual = t.sortArrayByParityII(nums);
        System.out.println(Arrays.toString(actual));
        for (int i = 0; i < actual.length; i++) {
            assertEquals(true, actual[i] % 2 == i % 2);
        }
    }

    @Test
    void test_2() {
        int[] nums = {3,4};
        int[] actual = t.sortArrayByParityII(nums);
        System.out.println(Arrays.toString(actual));
        for (int i = 0; i < actual.length; i++) {
            assertEquals(true, actual[i] % 2 == i % 2);
        }
    }
}