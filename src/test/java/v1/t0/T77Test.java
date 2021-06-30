package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T77Test {

    T77 t;

    @BeforeEach
    void setUp() {
        t = new T77();
    }

    @Test
    void test_1() {
        List<List<Integer>> actual = t.combine(4, 2);
        for (List<Integer> list : actual) {
            System.out.println(list);
        }
    }
}