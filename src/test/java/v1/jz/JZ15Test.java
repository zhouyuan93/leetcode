package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ15Test {
    JZ15 t ;

    @BeforeEach
    void setUp() {
        t = new JZ15();
    }

    @Test
    void test_1() {
        int x = 11;
        int actual = t.hammingWeight(x);
        int expected = 3;
        assertEquals(expected,actual);
    }

}