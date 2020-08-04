package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t0.T15;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class T15Test {

    T15 t;

    @BeforeEach
    void setUp() {
        t = new T15();
    }

    @Test
    void test_1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> actual = t.threeSum(nums);
        actual.forEach(list -> list.stream().sorted());
        actual.stream().sorted();

        List<List<Integer>> expected = new ArrayList<List<Integer>>(){{
            add(new ArrayList<Integer>() {{
                add(-1);
                add(-1);
                add(2);
            }});
            add(new ArrayList<Integer>() {{
                add(-1);
                add(0);
                add(1);
            }});
        }};
        expected.forEach(list -> list.stream().sorted());
        expected.stream().sorted();

        assertThat(actual).isEqualTo(expected);
    }
}