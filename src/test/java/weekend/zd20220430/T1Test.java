package weekend.zd20220430;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1Test {

    T1 t = new T1();

    @Test
    void test1() {
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";
        System.out.println(t.countPrefixes(words,s));
    }
}