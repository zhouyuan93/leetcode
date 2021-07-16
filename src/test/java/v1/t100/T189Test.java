package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class T189Test {

    T189 t;

    @BeforeEach
    void setUp() {
        t = new T189();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        t.rotate(nums, k);
        int[] e = {5, 6, 7, 1, 2, 3, 4};
        assertThat(nums).isEqualTo(e);
    }

    @Test
    void test_2() {
        int[] nums = {1,2,3,4};
        int k = 2;
        t.rotate(nums, k);
        int[] e = {3,4,1,2};
        assertThat(nums).isEqualTo(e);
    }
}