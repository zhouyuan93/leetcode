package weekend.zd20220430;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2Test {

    T2 t = new T2();

    @Test
    void test2() {

        int[] x = {2,5,3,9,5,3};
        int actual = t.minimumAverageDifference(x);
        assertEquals(3,actual);


    }

    @Test
    void test3() {

        int[] x = {0};
        int actual = t.minimumAverageDifference(x);
        assertEquals(0,actual);


    }

    @Test
    void test31() {

        int[] x = {4,2,0};
        int actual = t.minimumAverageDifference(x);
        assertEquals(2,actual);


    }

    @Test
    void test311() {

        int[] x = {0,0,0};
        int actual = t.minimumAverageDifference(x);
        assertEquals(0,actual);


    }
}