package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JZ21Test {

    JZ21 t;

    @BeforeEach
    void setUp() {
        t = new JZ21();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 4};
        int[] actual = t.exchange(nums);
        boolean expectedFlag = true;
        System.out.println(Arrays.toString(actual));
        for (int num : nums) {
            boolean actualFlag = num % 2 == 1;
            if (expectedFlag && !actualFlag) {
                expectedFlag = false;
            }
            assertEquals(expectedFlag, actualFlag);
        }
    }
}