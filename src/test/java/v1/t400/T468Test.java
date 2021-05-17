package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T468Test {

    T468 t;

    @BeforeEach
    void setUp() {
        t = new T468();
    }

    @Test
    void test_1() {
        String IP = "172.16.254.1";
        String actual = t.validIPAddress(IP);
        String expected = "IPv4";
        assertEquals(actual, expected);
    }


    @Test
    void test_2() {
        String IP = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        String actual = t.validIPAddress(IP);
        String expected = "IPv6";
        assertEquals(actual, expected);
    }

    @Test
    void test_4() {
        String IP = "2001:0db8:85a3:0:0:8A2E:0370:";
        String actual = t.validIPAddress(IP);
        String expected = "Neither";
        assertEquals(actual, expected);
    }

    @Test
    void test_5() {
        String IP = "256.256.256.256";
        String actual = t.validIPAddress(IP);
        String expected = "Neither";
        assertEquals(actual, expected);
    }
}