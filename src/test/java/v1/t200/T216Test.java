package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T216Test {
    T216 t;

    @BeforeEach
    void setUp() {
        t = new T216();
    }

    @Test
    void test_1() {
        int k = 3;
        int n = 7;
        List<List<Integer>> actual = t.combinationSum3(k, n);
        System.out.println(actual.toString());
    }

    @Test
    void test_3() {
        int k = 3;
        int n = 9;
        List<List<Integer>> actual = t.combinationSum3(k, n);
        System.out.println(actual.toString());
    }
}