package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T914Test {

    T914 t;

    @BeforeEach
    void setUp() {
        t = new T914();
    }

    @Test
    void test_1() {
        int[] nums = {1, 1, 1, 1, 1, 0, 0};

        boolean a = t.hasGroupsSizeX(nums);
        boolean e = false;
        assertEquals(e,a);
    }
}