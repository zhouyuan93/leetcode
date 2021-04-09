package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T115Test {

    T115 t;

    @BeforeEach
    void setUp() {
        t = new T115();
    }

    @Test
    void test_1() {
        String str = "rabbbit";
        String ts = "rabbit";
        int actual = t.numDistinct(str,ts);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String str = "babgbag";
        String ts = "bag";
        int actual = t.numDistinct(str,ts);
        int expected = 5;
        assertEquals(expected,actual);
    }
}