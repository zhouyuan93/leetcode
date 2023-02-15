package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST17_05Test {

    MST17_05 t;

    @BeforeEach
    void setUp() {
        t = new MST17_05();
    }

    @Test
    void test_1() {
        String[] s =
                {"A", "1", "B", "C", "D", "2", "3", "4", "E", "5", "F", "G", "6", "7", "H", "I", "J", "K", "L", "M"};

        String[] actual = t.findLongestSubarray(s);
        String[] expected = {"A", "1", "B", "C", "D", "2", "3", "4", "E", "5", "F", "G", "6", "7"};
        assertArrayEquals(expected, actual);
    }
    @Test
    void test_2() {
        String[] s = {"A", "A"};
        String[] actual = t.findLongestSubarray(s);
        String[] expected = {};
        assertArrayEquals(expected, actual);
    }

}