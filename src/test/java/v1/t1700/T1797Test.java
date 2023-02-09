package v1.t1700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1797Test {

    @Test
    void test_1() {
        T1797.AuthenticationManager auth = new T1797.AuthenticationManager(13);
        auth.renew("a",1);
        auth.countUnexpiredTokens(3);
        auth.countUnexpiredTokens(4);
        auth.generate("b", 5);
        auth.generate("c", 7);
        auth.renew("d", 12);
        auth.generate("e",13);
        auth.generate("f", 14);
        auth.countUnexpiredTokens(15);
        auth.countUnexpiredTokens(18);
        auth.countUnexpiredTokens(19);
        auth.renew("e",21);
        auth.countUnexpiredTokens(23);
        auth.countUnexpiredTokens(25);
        auth.countUnexpiredTokens(26);
        auth.generate("g",28);

        auth.countUnexpiredTokens(29);

        auth.renew("d", 30);

    }

    @Test
    void test_2() {
        T1797.AuthenticationManager auth = new T1797.AuthenticationManager(5);
        auth.renew("aaa",1);
        auth.generate("aaa", 2);
        auth.countUnexpiredTokens(6);
        auth.generate("bbb", 7);
        auth.renew("aaa",8);
        auth.renew("bbb",10);
        auth.countUnexpiredTokens(15);
    }
}