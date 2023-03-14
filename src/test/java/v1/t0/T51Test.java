package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T51Test {

    T51 t;

    @BeforeEach
    void setUp() {
        t = new T51();
    }

    @Test
    void test_1() {
        int n = 1;
        List<List<String>> actual = t.solveNQueens(n);
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(actual.get(i));
        }
    }

    @Test
    void test_2() {
        int n = 2;
        List<List<String>> actual = t.solveNQueens(n);
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(actual.get(i));
        }
    }

    @Test
    void test_3() {
        int n = 3;
        List<List<String>> actual = t.solveNQueens(n);
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(actual.get(i));
        }
    }

    @Test
    void test_4() {
        int n = 4;
        List<List<String>> actual = t.solveNQueens(n);
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(actual.get(i));
        }
    }

    @Test
    void test_5() {
        int n = 5;
        List<List<String>> actual = t.solveNQueens(n);
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(actual.get(i));
        }
    }

    @Test
    void test_6() {
        int n = 6;
        List<List<String>> actual = t.solveNQueens(n);
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(actual.get(i));
        }
    }

}