package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1723Test {
    
    T1723 t;

    @BeforeEach
    void setUp() {
        t = new T1723();
    }

    @Test
    void test_1() {
        int[] jobs = {1, 2, 4, 7, 8};
        int k = 2;
        int actual = t.minimumTimeRequired(jobs, k);
        int expected = 11;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] jobs = {3,2,3};
        int k = 3;
        int actual = t.minimumTimeRequired(jobs, k);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] jobs = {12,13,14,17,25};
        int k = 3;
        int actual = t.minimumTimeRequired(jobs, k);
        int expected = 29;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int[] jobs = {9899456,8291115,9477657,9288480,5146275,7697968,8573153,3582365,3758448,9881935,2420271,4542202};
        int k = 9;
        int actual = t.minimumTimeRequired(jobs, k);
        int expected = 9899456;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int[] jobs = {6518448,8819833,7991995,7454298,2087579,380625,4031400,2905811,4901241,8480231,7750692,3544254};
        int k = 4;
        int actual = t.minimumTimeRequired(jobs, k);
        int expected = 16274131;
        assertEquals(expected,actual);
    }
}