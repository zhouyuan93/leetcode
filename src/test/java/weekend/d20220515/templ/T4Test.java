package weekend.d20220515.templ;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T4Test {

    @Test
    void test_1() {
        CountIntervals t = new CountIntervals();
        t.add(2, 3);
        t.add(7, 10);
        System.out.println(t.count());
        t.add(5, 8);
        System.out.println(t.count());
    }
}