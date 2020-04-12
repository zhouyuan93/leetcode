package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T34;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T34Test {

    private T34 t;

    @BeforeEach
    void setUp() {
        this.t = new T34();
    }

    @Test
    public void test_7() {
        int[] nums = {7,8};
        int target =  7;
        int[] actual = t.searchRange(nums, target);
        int[] except = {0,0};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(except, actual);
    }
    @Test
    public void test_6() {
        int[] nums = {7,7};
        int target =  7;
        int[] actual = t.searchRange(nums, target);
        int[] except = {0,1};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(except, actual);
    }
    @Test
    public void test_5() {
        int[] nums = {5,7,7,8,8,10};
        int target =  9;
        int[] actual = t.searchRange(nums, target);
        int[] except = {-1,-1};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(except, actual);
    }
    @Test
    public void test_4() {
        int[] nums = {5,7,7,8,8,10};
        int target =  5;
        int[] actual = t.searchRange(nums, target);
        int[] except = {0, 0};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(except, actual);
    }
    @Test
    public void test_3() {
        int[] nums = {5,7,7,8,8,10};
        int target =  10;
        int[] actual = t.searchRange(nums, target);
        int[] except = {5, 5};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(except, actual);
    }
    @Test
    public void test_2() {
        int[] nums = {5};
        int target = 5;
        int[] actual = t.searchRange(nums, target);
        int[] except = {0, 0};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(except, actual);
    }
    @Test
    public void test_1() {
        int[] nums = {5,7,7,8,8,10};
        int target =  8;
        int[] actual = t.searchRange(nums, target);
        int[] except = {3, 4};
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(except, actual);
    }
}