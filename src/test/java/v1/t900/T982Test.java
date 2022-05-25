package v1.t900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T982Test {

    T982 t = new T982();


    @Test
    void test_1() {
        int[] nums = {2, 1, 3};
        int actual = t.countTriplets(nums);
        int expected = 12;
        assertEquals(expected, actual);
    }
}