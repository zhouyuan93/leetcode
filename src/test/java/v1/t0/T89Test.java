package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T89Test {

    T89 t;

    @BeforeEach
    void setUp() {
        t = new T89();
    }

    @Test
    void test_1() {
        List<Integer> actual = t.grayCode(3);
        for (int i = 1; i < actual.size(); i++) {
            System.out.println(Integer.toBinaryString(actual.get(i) ^ actual.get(i - 1)));
        }
    }
}