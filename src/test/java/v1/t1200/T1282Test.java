package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T1282Test {
    T1282 t;

    @BeforeEach
    void setUp() {
        t = new T1282();
    }

    @Test
    void test_1() {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        List<List<Integer>> actual = t.groupThePeople(groupSizes);
        System.out.println(actual);
    }
}