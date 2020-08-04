package v1.t100;

import org.junit.jupiter.api.Test;
import v1.t100.T171;

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