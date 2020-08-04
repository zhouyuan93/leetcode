package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t700.T739;

import static org.assertj.core.api.Assertions.assertThat;

class T739Test {

    T739 t;

    @BeforeEach
    void setUp() {
        t = new T739();
    }

    @Test
    void test_2() {
        int[] nums = {55,38,53,81,61,93,97,32,43,78};
        int[] actual = t.dailyTemperatures(nums);
        int[] expected = {3,1,1,2,1,1,0,1,1,0};
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void test_1() {
        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] actual = t.dailyTemperatures(nums);
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertThat(actual).isEqualTo(expected);
    }
}