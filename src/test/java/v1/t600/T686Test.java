package v1.t600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T686Test {

    T686 t = new T686();

    @Test
    void name() {
        String a = "aaac";
        String b = "aac";
        System.out.println(t.repeatedStringMatch(a, b));
    }
}