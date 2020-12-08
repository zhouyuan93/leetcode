package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T842Test {

    T842 t;

    @BeforeEach
    void setUp() {
        t = new T842();
    }

    @Test
    void test_1() {
        String s = "123456579";
        List<Integer> list = t.splitIntoFibonacci(s);
        List<Integer> expected = Arrays.asList(123, 456, 579);
        assertEquals(expected, list);
    }

    @Test
    void test_2() {
        String s = "1234565790";
        List<Integer> list = t.splitIntoFibonacci(s);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, list);
    }

    @Test
    void test_3() {
        String s = "0123";
        List<Integer> list = t.splitIntoFibonacci(s);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, list);
    }

    @Test
    void test_4() {
        String s = "1101111";
        List<Integer> list = t.splitIntoFibonacci(s);
        List<Integer> expected = Arrays.asList(11,0,11,11);
        assertEquals(expected, list);
    }

    @Test
    void test_5() {
        String s = "123";
        List<Integer> list = t.splitIntoFibonacci(s);
        List<Integer> expected = Arrays.asList(1,2,3);
        assertEquals(expected, list);
    }

    @Test
    void test_6() {
        String s = "11011112";
        List<Integer> list = t.splitIntoFibonacci(s);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, list);
    }

    @Test
    void test_7() {
        String s = "808816244064104168";
        List<Integer> list = t.splitIntoFibonacci(s);
        List<Integer> expected = Arrays.asList(8,0,8,8,16,24,40,64,104,168);
        assertEquals(expected, list);
    }


}