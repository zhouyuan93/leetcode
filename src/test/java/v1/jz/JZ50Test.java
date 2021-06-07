package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ50Test {

    JZ50 t;

    @BeforeEach
    void setUp() {
        t = new JZ50();
    }

    @Test
    void test_1() {
        String s = "abaccdeff";
        char actual = t.firstUniqChar(s);
        char expected = 'b';
        assertEquals(expected,actual);
    }
}