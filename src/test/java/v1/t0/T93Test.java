package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T93Test {

    T93 t;

    @BeforeEach
    void setUp() {
        t = new T93();
    }

    @Test
    void test_1() {
        String s = "25525511135";
        List<String> actual = t.restoreIpAddresses(s);
        actual.sort(Comparator.naturalOrder());
        List<String> expect = new ArrayList<String>() {{
            add("255.255.11.135");
            add("255.255.111.35");
        }};
        expect.sort(Comparator.naturalOrder());
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        String s = "2551111111";
        List<String> actual = t.restoreIpAddresses(s);
        actual.sort(Comparator.naturalOrder());
        List<String> expect = new ArrayList<String>() {{
            add("255.111.11.11");
            add("255.11.111.11");
            add("255.11.11.111");
            add("255.1.111.111");
            add("255.111.1.111");
            add("255.111.111.1");
            add("25.51.111.111");
        }};
        expect.sort(Comparator.naturalOrder());
        assertEquals(expect, actual);
    }
    @Test
    void test_3() {
        String s = "0000";
        List<String> actual = t.restoreIpAddresses(s);
        actual.sort(Comparator.naturalOrder());
        List<String> expect = new ArrayList<String>() {{
            add("0.0.0.0");
        }};
        expect.sort(Comparator.naturalOrder());
        assertEquals(expect, actual);
    }
    @Test
    void test_4() {
        String s = "00100";
        List<String> actual = t.restoreIpAddresses(s);
        actual.sort(Comparator.naturalOrder());
        List<String> expect = new ArrayList<String>() {{
            add("0.0.10.0");
        }};
        expect.sort(Comparator.naturalOrder());
        assertEquals(expect, actual);
    }
}