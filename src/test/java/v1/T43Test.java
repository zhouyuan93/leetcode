package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T43;

import static org.junit.jupiter.api.Assertions.*;

class T43Test {
    T43 t;

    @BeforeEach
    void setUp() {
        t = new T43();
    }

    @Test
    void test_1() {
        String num1 = "12666664454545453";
        String num2 = "456666666666666666666666666666";
        String actual = t.multiply(num1, num2);
        String expected = "5784443434242423536666666666658222223696969698";
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String num1 = "123456789";
        String num2 = "987654321";
        String actual = t.multiply(num1, num2);
        String expected = "121932631112635269";
        assertEquals(expected, actual);
    }
    @Test
    void test_3() {
        String num1 = "140";
        String num2 = "721";
        String actual = t.multiply(num1, num2);
        String expected = "100940";
        assertEquals(expected, actual);
    }
}