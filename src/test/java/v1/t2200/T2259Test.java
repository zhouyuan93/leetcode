package v1.t2200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2259Test {
    T2259 t = new T2259();

    @Test
    void test_1() {
        String number = "123";
        String actual = t.removeDigit(number, '3');
        String expected = "12";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String number = "1231";
        String actual = t.removeDigit(number, '1');
        String expected = "231";
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String number = "551";
        String actual = t.removeDigit(number, '5');
        String expected = "51";
        assertEquals(expected,actual);
    }
}