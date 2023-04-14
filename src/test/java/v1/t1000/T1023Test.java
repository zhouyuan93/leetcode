package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1023Test {

    T1023 t;

    @BeforeEach
    void setUp() {
        t = new T1023();
    }

    @Test
    void test_1() {
        String[] queries = {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern = "FB";
        List<Boolean> actual = t.camelMatch(queries, pattern);
        List<Boolean> expected = Arrays.asList(true, false, true, true, false);
        assertEquals(expected.toString(), actual.toString());
    }
}