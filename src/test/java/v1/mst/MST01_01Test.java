package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST01_01Test {

    MST01_01 t;

    @BeforeEach
    void setUp() {
        t = new MST01_01();
    }

    @Test
    void test_1() {
        String s = "leetcode";
        assertFalse(t.isUnique(s));
    }
}