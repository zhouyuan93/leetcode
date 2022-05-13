package v1.mst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST01_05Test {

    MST01_05 t = new MST01_05();

    @Test
    void test_1() {
        String first = "islander";
        String second = "slander";
        boolean actual = t.oneEditAway(first, second);
        assertEquals(true,actual);
    }
}