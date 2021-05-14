package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1002Test {
    T1002 t;

    @BeforeEach
    void setUp() {
        t = new T1002();
    }

    @Test
    void test_1() {
        String[] A = {"bella","label","roller"};
        List<String> actual = t.commonChars(A);
        List<String> expected = Arrays.asList("e", "l", "l");
        actual.stream().sorted();
        expected.stream().sorted();
        assertEquals(expected,actual);
    }
}