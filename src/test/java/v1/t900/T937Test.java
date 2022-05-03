package v1.t900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T937Test {

    T937 t = new T937();

    @Test
    void test_11111111111111111() {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] actual = t.reorderLogFiles(logs);
        String[] expected = {"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};
        assertArrayEquals(expected,actual);
    }

    @Test
    void test_1111111111111111() {
        String[] logs = {"1 n u", "r 527", "j 893", "6 14", "6 82"};
        String[] actual = t.reorderLogFiles(logs);
        String[] expected = {"1 n u","r 527","j 893","6 14","6 82"};
        assertArrayEquals(expected,actual);
    }

    @Test
    void test_111111111111111() {
        String[] logs = {"zoey i love you","lucas i love you","rong i love you"};
        String[] actual = t.reorderLogFiles(logs);
        String[] expected = {"lucas i love you","rong i love you","zoey i love you"};
        assertArrayEquals(expected,actual);
    }
}