package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T282Test {

    T282 t;

    @BeforeEach
    void setUp() {
        t = new T282();
    }

    @Test
    void test_1() {
        String num = "123";
        int target = 6;
        List<String> actual = t.addOperators(num, target);
        List<String> expected = Arrays.asList("1+2+3", "1*2*3");
        actual.sort(Comparator.comparingInt(s -> s.hashCode()));
        expected.sort(Comparator.comparingInt(s -> s.hashCode()));
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String num = "232";
        int target = 8;
        List<String> actual = t.addOperators(num, target);
        List<String> expected = Arrays.asList("2*3+2", "2+3*2");
        actual.sort(Comparator.comparingInt(s -> s.hashCode()));
        expected.sort(Comparator.comparingInt(s -> s.hashCode()));
        assertEquals(expected,actual);
    }


    @Test
    void test_3() {
        String num = "105";
        int target = 5;
        List<String> actual = t.addOperators(num, target);
        List<String> expected = Arrays.asList("1*0+5", "10-5");
        actual.sort(Comparator.comparingInt(s -> s.hashCode()));
        expected.sort(Comparator.comparingInt(s -> s.hashCode()));
        assertEquals(expected,actual);
    }


    @Test
    void test_4() {
        String num = "00";
        int target = 0;
        List<String> actual = t.addOperators(num, target);
        List<String> expected = Arrays.asList("0+0", "0-0", "0*0");
        actual.sort(Comparator.comparingInt(s -> s.hashCode()));
        expected.sort(Comparator.comparingInt(s -> s.hashCode()));
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        String num = "2147483648";
        int target = -2147483648;
        List<String> actual = t.addOperators(num, target);
        List<String> expected = Arrays.asList();
        actual.sort(Comparator.comparingInt(s -> s.hashCode()));
        expected.sort(Comparator.comparingInt(s -> s.hashCode()));
        assertEquals(expected,actual);
    }
}