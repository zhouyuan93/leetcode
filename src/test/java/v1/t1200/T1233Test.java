package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1233Test {

    T1233 t;

    @BeforeEach
    void setUp() {
        t = new T1233();
    }

    @Test
    void test_1() {
        String[] folder = {"/a", "/a/b/c", "/a/b/d"};
        List<String> actual = t.removeSubfolders(folder);
        List<String> expected = Arrays.asList("/a");
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String[] folder = {"/a","/a/b","/c/d","/c/d/e","/c/f"};
        List<String> actual = t.removeSubfolders(folder);
        List<String> expected = Arrays.asList("/a","/c/d","/c/f");
        assertEquals(expected,actual);
    }
}