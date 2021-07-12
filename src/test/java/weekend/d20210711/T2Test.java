package weekend.d20210711;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2Test {

    T2 t = new T2();

    @Test
    void name() {
        String s = "aabca";
        System.out.println(t.countPalindromicSubsequence(s));
    }


    @Test
    void t1() {
        String s = "bbcbaba";
        System.out.println(t.countPalindromicSubsequence(s));
    }
}