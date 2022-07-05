package v1.t700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T729Test {

    @Test
    void test_1() {
        T729.MyCalendar myCalendar = new T729.MyCalendar();
        assertEquals(true,myCalendar.book(10,20));
        assertEquals(false,myCalendar.book(15,25));
        assertEquals(true,myCalendar.book(20,30));
    }
}