package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T127Test {

    T127 t;

    @BeforeEach
    void setUp() {
        t = new T127();
    }

    @Test
    void test_1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<String>() {{
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
            add("cog");
        }};
        int actual = t.ladderLength(beginWord, endWord, wordList);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<String>() {{
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
        }};
        int actual = t.ladderLength(beginWord, endWord, wordList);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String beginWord = "hit";
        String endWord = "coa";
        List<String> wordList = new ArrayList<String>() {{
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
            add("cog");
            add("coa");
        }};
        int actual = t.ladderLength(beginWord, endWord, wordList);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String beginWord = "hit";
        String endWord = "dot";
        List<String> wordList = new ArrayList<String>() {{
            add("hot");
            add("dot");
            add("dog");
            add("lot");
            add("log");
            add("cog");
            add("coa");
        }};
        int actual = t.ladderLength(beginWord, endWord, wordList);
        int expected = 3;
        assertEquals(expected, actual);
    }
}