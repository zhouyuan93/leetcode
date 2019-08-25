package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T227;

import static org.junit.jupiter.api.Assertions.*;

class T227Test {

    T227 t;
    @BeforeEach
    void setUp() {
        t = new T227();
    }

    @Test
    void test_1(){
        String s = "3+2*2";
        int actual = t.calculate(s);
        int expected = 7;
        assertEquals(expected,actual);
    }
    @Test
    void test_2(){
        String s = "3/2";
        int actual = t.calculate(s);
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    void test_3(){
        String s = "3*2";
        int actual = t.calculate(s);
        int expected = 6;
        assertEquals(expected,actual);
    }
    @Test
    void test_4(){
        String s = "3+5/2";
        int actual = t.calculate(s);
        int expected = 5;
        assertEquals(expected,actual);
    }
    @Test
    void test_5(){
        String s = "1+2/2+3/2+1*2";
        int actual = t.calculate(s);
        int expected = 5;
        assertEquals(expected,actual);
    }
    @Test
    void test_6(){
        String s = "3*2/1*1+1*1/2";
        int actual = t.calculate(s);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void test_7(){
        String s = "3 / 2 ";
        int actual = t.calculate(s);
        int expected = 1;
        assertEquals(expected,actual);
    }
}