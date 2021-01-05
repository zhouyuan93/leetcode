package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T830Test {

    T830 t;

    @BeforeEach
    void setUp() {
        t = new T830();
    }

    @Test
    void test_1() {
        String s = "abbxxxxzzy";
        List<List<Integer>> actual = t.largeGroupPositions(s);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3, 6));
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        String s = "abcdddeeeeaabbbcd";
        List<List<Integer>> actual = t.largeGroupPositions(s);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3, 5));
        expected.add(Arrays.asList(6, 9));
        expected.add(Arrays.asList(12, 14));
        assertEquals(expected,actual);
    }
}