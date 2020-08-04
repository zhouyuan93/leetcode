package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t0.T46;

import java.util.List;

class T46Test {
    T46 t ;

    @BeforeEach
    void setUp() {
        t = new T46();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2};
        List<List<Integer>> actual = t.permute(nums);
        actual.forEach(node -> System.out.println(node.toString()));
    }

    @Test
    void test_2() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> actual = t.permute(nums);
        actual.forEach(node -> System.out.println(node.toString()));
    }
    @Test
    void test_3() {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> actual = t.permute(nums);
        actual.forEach(node -> System.out.println(node.toString()));
    }
}