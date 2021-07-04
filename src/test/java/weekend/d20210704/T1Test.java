package weekend.d20210704;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1Test {

    T1 t = new T1();

    @Test
    void test_1() {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(t.buildArray(nums)));
    }
}