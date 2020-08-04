package v1.t900;

import org.junit.jupiter.api.Test;
import v1.t900.T961;

import static org.junit.jupiter.api.Assertions.*;

class T961Test {
    T961 t = new T961();

    @Test
    public void test_case_1(){
        int[] A = {1, 2, 3, 3};
        int res = t.repeatedNTimes(A);
        assertEquals(3,res);
    }

}