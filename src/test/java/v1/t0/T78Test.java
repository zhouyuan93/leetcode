package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T78Test {
    T78 t;

    @BeforeEach
    void setUp() {
        t = new T78();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> actual = t.subsets(nums);
        for (List<Integer> l : actual) {
            System.out.println(l);
        }
    }
}