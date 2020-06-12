package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T367;

import static org.assertj.core.api.Assertions.assertThat;

class T367Test {
    T367 t;

    @BeforeEach
    void setUp() {
        t = new T367();
    }

    @Test
    void test_4() {
        boolean actual = t.isPerfectSquare(46340);
        boolean expected = true;
        assertThat(actual).isTrue();
    }
    @Test
    void test_3() {
        boolean actual = t.isPerfectSquare(1);
        boolean expected = true;
        assertThat(actual).isTrue();
    }

    @Test
    void test_1() {
        boolean actual = t.isPerfectSquare(400);
        boolean expected = true;
        assertThat(actual).isTrue();
    }

    @Test
    void test_2() {
        boolean actual = t.isPerfectSquare(4100);
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }
}