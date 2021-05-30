package v1.jz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JZ60Test {

    JZ60 t = new JZ60();

    @Test
    void test_1() {
        int n = 1;
        double[] actual = t.dicesProbability(n);
        System.out.println(Arrays.toString(actual));
    }

    @Test
    void test_2() {
        int n = 2;
        double[] actual = t.dicesProbability(n);
        System.out.println(Arrays.toString(actual));
    }

    @Test
    void test_3() {
        int n = 3;
        double[] actual = t.dicesProbability(n);
        System.out.println(Arrays.toString(actual));
    }

    @Test
    void test_4() {
        int n = 11;
        double[] actual = t.dicesProbability(n);
        System.out.println(Arrays.toString(actual));
    }
}