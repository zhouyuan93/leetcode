package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T179Test {

    T179 t;

    @BeforeEach
    void setUp() {
        t = new T179();
    }

    @Test
    void test_compare_1() {
        System.out.println(t.compare(830, 8308));
        assertEquals(true,t.compare(830, 8308) < 0);
    }

    @Test
    void test_sorted_1() {
        int[] nums = new int[]{1, 3, 2, 1, 2};
        t.sorted(nums, 0, nums.length-1);
        int[] expected = new int[]{3,2,2,1,1};
        assertArrayEquals(expected,nums, Arrays.toString(nums));


        nums = new int[]{2, 3,1,3,1,1,3,3};
        t.sorted(nums, 0, nums.length-1);
        expected = new int[]{3,3,3,3,2,1,1,1};
        assertArrayEquals(expected,nums, Arrays.toString(nums));
    }

    @Test
    void test_1() {
        int[] nums = new int[]{1, 12, 13, 2, 21, 22, 3, 31, 32, 34};
        String actual = t.largestNumber(nums);
        String expected = "34332312222113121";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = new int[]{8308,8308,830};
        String actual = t.largestNumber(nums);
        String expected = "83088308830";
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] nums = new int[]{432,43243};
        String actual = t.largestNumber(nums);
        String expected = "43243432";
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] nums = new int[]{111311, 1113};
        String actual = t.largestNumber(nums);
        String expected = "1113111311";
        assertEquals(expected,actual);
    }
}