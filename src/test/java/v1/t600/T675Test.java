package v1.t600;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T675Test {

    T675 t = new T675();

    @Test
    void test1() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(1, 2, 3));

        int actual = t.cutOffTree(forest);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test2() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(5,1, 2, 3));

        int actual = t.cutOffTree(forest);
        int expected = 6;
        assertEquals(expected,actual);

    }

    @Test
    void test3() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(1, 2, 3));
        forest.add(Arrays.asList(0, 0, 4));
        forest.add(Arrays.asList(7, 6, 5));

        int actual = t.cutOffTree(forest);
        int expected = 6;
        assertEquals(expected,actual);

    }

    @Test
    void test4() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(1, 2, 3));
        forest.add(Arrays.asList(0, 0, 0));
        forest.add(Arrays.asList(7, 6, 5));

        int actual = t.cutOffTree(forest);
        int expected = -1;
        assertEquals(expected,actual);

    }

    @Test
    void test5() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(1));
        forest.add(Arrays.asList(0));
        forest.add(Arrays.asList(7));

        int actual = t.cutOffTree(forest);
        int expected = -1;
        assertEquals(expected,actual);

    }

    @Test
    void test6() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(1,0,7));

        int actual = t.cutOffTree(forest);
        int expected = -1;
        assertEquals(expected,actual);

    }

    @Test
    void test7() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(2, 3, 4));
        forest.add(Arrays.asList(0, 0, 5));
        forest.add(Arrays.asList(8, 7, 6));

        int actual = t.cutOffTree(forest);
        int expected = 6;
        assertEquals(expected,actual);

    }

    @Test
    void test8() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(1,2));
        forest.add(Arrays.asList(1,1));
        forest.add(Arrays.asList(1,1));
        forest.add(Arrays.asList(1,1));
        forest.add(Arrays.asList(1,6));

        int actual = t.cutOffTree(forest);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test9() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(2));
        forest.add(Arrays.asList(1));
        forest.add(Arrays.asList(1));
        forest.add(Arrays.asList(1));
        forest.add(Arrays.asList(6));

        int actual = t.cutOffTree(forest);
        int expected = 4;
        assertEquals(expected,actual);

    }

    @Test
    void test10() {
        List<List<Integer>> forest = new ArrayList<>();
        forest.add(Arrays.asList(63750247,40643210,95516857,89928134,66334829,58741187,76532780,45104329));
        forest.add(Arrays.asList(3219401,97566322,9135413,75944198,93735601,33923288,50116695,83660397));
        forest.add(Arrays.asList(64460750,53045740,31903386,78155821,90848739,38769489,99349027,85982891));
        forest.add(Arrays.asList(30628785,51077683,70534803,67460877,91077770,74197235,5696362,91459886));
        forest.add(Arrays.asList(56105195,82479378,45937951,52817583,2768114,43329099,28189138,21418604));

        int actual = t.cutOffTree(forest);
        int expected = 192;
        assertEquals(expected,actual);

    }
}