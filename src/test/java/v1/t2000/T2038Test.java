package v1.t2000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2038Test {

    T2038 t;

    @BeforeEach
    void setUp() {
        t = new T2038();
    }

    @Test
    void test_1() {
        String color = "AAABABB";
        boolean actual = t.winnerOfGame(color);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String color = "AAABBBBBBBBBBABB";
        boolean actual = t.winnerOfGame(color);
        boolean expected = false;
        assertEquals(expected, actual);
    }
@Test
    void test_3() {
        String color = "AAAABBBB";
        boolean actual = t.winnerOfGame(color);
        boolean expected = false;
        assertEquals(expected, actual);
    }

}