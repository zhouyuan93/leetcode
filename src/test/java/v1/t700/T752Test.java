package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T752Test {

    T752 t;

    @BeforeEach
    void setUp() {
        t = new T752();
    }

    @Test
    void test_1() {
        String[] deadends = new String[]{"0201","0101","0102","1212","2002"};
        String target = "0202";
        int actual = t.openLock(deadends, target);
        int expected = 6;
        assertEquals(expected, actual);
    }
}