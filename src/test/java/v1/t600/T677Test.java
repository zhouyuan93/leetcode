package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T677Test {

    T677 t;

    @BeforeEach
    void setUp() {
        t = new T677();
    }

    @Test
    void test_1() {
        T677.MapSum map = new T677.MapSum();
        map.insert("apple", 3);
        assertEquals(3, map.sum("ap"));
        map.insert("app", 2);
        assertEquals(5,map.sum("ap"));
    }
}