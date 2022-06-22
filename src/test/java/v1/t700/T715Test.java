package v1.t700;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class T715Test {



    @Test
    void test1() {
        T715.RangeModule rangeModule = new T715.RangeModule();
        rangeModule.addRange(10, 20);
        rangeModule.removeRange(14, 16);
        assertEquals(true,rangeModule.queryRange(10, 14));
        assertEquals(false,rangeModule.queryRange(13, 15));
        assertEquals(true,rangeModule.queryRange(16, 17));
    }

    @Test
    void test2() {
        T715.RangeModule rangeModule = new T715.RangeModule();
        rangeModule.addRange(1, 2);
        rangeModule.addRange(2, 3);
        rangeModule.addRange(3, 4);
        rangeModule.addRange(4, 5);
        rangeModule.addRange(5, 6);
        rangeModule.removeRange(7, 8);
        assertEquals(false,rangeModule.queryRange(10, 14));
        assertEquals(false,rangeModule.queryRange(13, 15));
        assertEquals(false,rangeModule.queryRange(16, 17));
        assertEquals(true,rangeModule.queryRange(2, 5));
    }
}