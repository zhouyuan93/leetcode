package v1.jz2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZZ030Test {

    @Test
    void test_1() {
        JZZ030.RandomizedSet set = new JZZ030.RandomizedSet();
        set.insert(0);
        set.insert(1);
        set.remove(0);
        set.insert(2);
        set.remove(1);
        System.out.println(set.getRandom());
    }
}