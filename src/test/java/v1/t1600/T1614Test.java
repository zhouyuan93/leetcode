package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1614Test {

    T1614 t;

    @BeforeEach
    void setUp() {
        t = new T1614();
    }

    @Test
    void test_1() {
        String s = "(1+(2*3)+((8)/4))+1";
        int actual = t.maxDepth(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s = "(1)+((2))+(((3)))";
        int actual = t.maxDepth(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s = "8*((1*(5+6))*(8/6))";
        int actual = t.maxDepth(s);
        int expected = 3;
        assertEquals(expected, actual);
    }


}