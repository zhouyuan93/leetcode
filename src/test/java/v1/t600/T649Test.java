package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T649Test {

    T649 t;

    @BeforeEach
    void setUp() {
        t = new T649();
    }

    @Test
    void test_1() {
        String senate = "RD";
        String actual = t.predictPartyVictory(senate);
        String expected = "Radiant";
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String senate = "RDD";
        String actual = t.predictPartyVictory(senate);
        String expected = "Dire";
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String senate = "RDRRRDDDD";
        String actual = t.predictPartyVictory(senate);
        String expected = "Radiant";
        assertEquals(expected, actual);
    }
}