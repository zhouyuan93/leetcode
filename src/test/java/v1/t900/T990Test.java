package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t900.T990;

import static org.junit.jupiter.api.Assertions.*;

class T990Test {
    T990 t;

    @BeforeEach
    void setUp() {
        t = new T990();
    }
    @Test
    void test_6() {
        String[] equations = {"a==b","e==c","b==c","a!=e"};
        boolean actual = t.equationsPossible(equations);
        boolean expected = false;
        assertEquals(expected, actual);

    }

    @Test
    void test_5() {
        String[] equations = {"c==c","f!=a","f==b","b==c"};
        boolean actual = t.equationsPossible(equations);
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void test_4() {
        String[] equations = {"b==a", "a==b"};
        boolean actual = t.equationsPossible(equations);
        boolean expected = true;
        assertEquals(expected, actual);

    }

    @Test
    void test_3() {
        String[] equations = {"a==b", "b==c", "a==c"};
        boolean actual = t.equationsPossible(equations);
        boolean expected = true;
        assertEquals(expected, actual);

    }

    @Test
    void test_2() {
        String[] equations = {"a==b", "b!=c", "c==a"};
        boolean actual = t.equationsPossible(equations);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_1() {
        String[] equations = {"c==c", "b==d", "x!=z"};
        boolean actual = t.equationsPossible(equations);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}