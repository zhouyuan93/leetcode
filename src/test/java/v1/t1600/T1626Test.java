package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1626Test {

    T1626 t;

    @BeforeEach
    void setUp() {
        t = new T1626();
    }

    @Test
    void test() {
        int[] scores = {4,5,6,5};
        int[] ages = {2,1,2,1};
        int actual = t.bestTeamScore(scores, ages);
        int expected = 16;
        assertEquals(expected,actual);
    }
    @Test
    void test_2() {
        int[] scores = {1,1,1,1,1,1,1,1,1,1};
        int[] ages = {811,364,124,873,790,656,581,446,885,134};
        int actual = t.bestTeamScore(scores, ages);
        int expected = 10;
        assertEquals(expected,actual);
    }
}