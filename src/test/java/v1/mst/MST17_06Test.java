package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST17_06Test {

    MST17_06 t ;

    @BeforeEach
    void setUp() {
        t = new MST17_06();
    }

    @Test
    void test_1() {
        assertEquals(14,t.numberOf2sInRange(32));
        assertEquals(1,t.numberOf2sInRange(2));
        assertEquals(9,t.numberOf2sInRange(25));
        assertEquals(2,t.numberOf2sInRange(19));
    }
}