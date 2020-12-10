package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T860Test {
    T860 t;

    @BeforeEach
    void setUp() {
        t = new T860();
    }

    @Test
    void test_1() {
        int[] bills = {5, 5, 5, 10, 20};
        boolean actual = t.lemonadeChange(bills);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] bills = {5, 5, 20, 20, 5, 10, 20};
        boolean actual = t.lemonadeChange(bills);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] bills = {5,5,5,20,5,5,5,20,5,5,5,10,5,20,10,20,10,20,5,5};
        boolean actual = t.lemonadeChange(bills);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}