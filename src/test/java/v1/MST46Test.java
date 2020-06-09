package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MST46Test {

    MST46 t;

    @BeforeEach
    void setUp() {
        t = new MST46();
    }

    @Test
    void test_1() {
        int num = 12258;
        int actual = t.translateNum(num);
        int expected = 5;
        assertEquals(expected,actual);
    }
}