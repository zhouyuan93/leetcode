package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T824Test {
    T824 t;

    @BeforeEach
    void setUp() {
        t = new T824();
    }

    @Test
    void test_1() {
        String S = "I speak Goat Latin";
        String actual = t.toGoatLatin(S);
        String expected = "Imaa peaksmaaa oatGmaaaa atinLmaaaaa";
        assertEquals(expected, actual);
    }
}