package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T1744Test {

    T1744 t;

    @BeforeEach
    void setUp() {
        t = new T1744();
    }

    @Test
    void test_1() {
        int[] candiesCount = {7, 4, 5, 3, 8};
        int[][] queries = {{0, 2, 2}, {4, 2, 4}, {2, 13, 1000000000}};
        boolean[] actual = t.canEat(candiesCount, queries);
        System.out.println(Arrays.toString(actual));
        boolean[] expected = {true, false, true};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] candiesCount = {5, 2, 6, 4, 1};
        int[][] queries = {{3, 1, 2}, {4, 10, 3}, {3, 10, 100}, {4, 100, 30}, {1, 3, 1}};
        boolean[] actual = t.canEat(candiesCount, queries);
        System.out.println(Arrays.toString(actual));
        boolean[] expected = {false, true, true, false, false};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[] candiesCount = {10,11,42,42,49,14,44,33,13,49,32,19,48,36,25,38,32,45,30,21,13,45,39,12,12,25,26,18,35,28
                ,1,31,14,16,38,49,26,33,39,39,7,31,20,8,49,36,6,1,32,2,35,10,31,37,13,43,26};
        int[][] queries = {{10,449,58}, {1,14,3}};
        boolean[] actual = t.canEat(candiesCount, queries);
        System.out.println(Arrays.toString(actual));
        boolean[] expected = {false,true};
        assertArrayEquals(expected, actual);
    }



    @Test
    void test_4() {
        int[] candiesCount =  {16,38,8,41,30,31,14,45,3,2,24,23,38,30,31,17,35,4,9,42,28,18,37,18,14,46,11,13,19,3,5,39,24,48,20,29,4,19,36,11,28,49,38,16,23,24,4,22,29,35,45,38,37,40,2,37,8,41,33,8,40,27,13,4,33,5,8,14,19,35,31,8,8};
        int[][] queries = {{43,1054,49}};
        boolean[] actual = t.canEat(candiesCount, queries);
        System.out.println(Arrays.toString(actual));
        boolean[] expected = {false};
        assertArrayEquals(expected, actual);
    }
}