package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1024Test {

    T1024 t;

    @BeforeEach
    void setUp() {
        t = new T1024();
    }

    @Test
    void test_1() {
        int[][] clips = {{0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}};
        int tt = 10;
        int a = t.videoStitching(clips, tt);
        int e = 3;
        assertEquals(e, a);
    }

    @Test
    void test_2() {
        int[][] clips = {{1, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}};
        int tt = 10;
        int a = t.videoStitching(clips, tt);
        int e = -1;
        assertEquals(e, a);
    }
}