package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T47Test {

    T47 t;

    @BeforeEach
    void setUp() {
        t = new T47();
    }

    @Test
    void test_1() {
        int[] nums = {1, 1, 2};
        List<List<Integer>> lists = t.permuteUnique(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
        System.out.println(lists.size());

    }
}