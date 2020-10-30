package v1.t1100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1138Test {

    T1138 t;

    @BeforeEach
    void setUp() {
        t = new T1138();
    }

    @Test
    void test_1() {
        String target = "leet";
        String actual = t.alphabetBoardPath(target);
        String expected = "RDD!RRRUU!!DDD!";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String target = "code";
        String actual = t.alphabetBoardPath(target);
        String expected = "RR!RRDD!LUU!R!";
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String target = "aaa";
        String actual = t.alphabetBoardPath(target);
        String expected = "!!!";
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String target = "zdz";
        String actual = t.alphabetBoardPath(target);
        String expected = "DDDDD!URRRUUUU!LLLDDDDD!";
        assertEquals(expected,actual);
    }
}