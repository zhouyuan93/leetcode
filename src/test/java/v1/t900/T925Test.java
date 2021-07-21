package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T925Test {
    
    T925 t;

    @BeforeEach
    void setUp() {
        t = new T925();
    }


    @Test
    void test_1() {
        String name = "leelee";
        String typed = "lleeelee";
        boolean a = t.isLongPressedName(name, typed);
        boolean e = true;
        assertEquals(e,a);
    }


    @Test
    void test_2() {
        String name = "vtkgn";
        String typed = "vttkgnn";
        boolean a = t.isLongPressedName(name, typed);
        boolean e = true;
        assertEquals(e, a);
    }

    @Test
    void test_3() {
        String name = "a";
        String typed = "aaaaaaaaaaa";
        boolean a = t.isLongPressedName(name, typed);
        boolean e = true;
        assertEquals(e, a);
    }
}