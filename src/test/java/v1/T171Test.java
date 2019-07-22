package v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T171Test {

    T171 t = new T171();

    @Test
    public void test_case_1() {
        String s = "AA";
        int res = t.titleToNumber(s);
        assertEquals(27,res);
    }

}