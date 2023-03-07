package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T90Test {

    T90 t;

    @BeforeEach
    void setUp() {
        t = new T90();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> acutual = t.subsetsWithDup(nums);
        for (List<Integer> list : acutual) {
            System.out.println(list.toString());
        }
    }

}