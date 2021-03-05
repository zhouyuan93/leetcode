package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T981Test {
    T981 t;

    @BeforeEach
    void setUp() {
        t = new T981();
    }

    @Test
    void test_1() {
        T981.TimeMap kv = new T981.TimeMap();
        kv.set("foo", "bar", 1);
        assertEquals("bar", kv.get("foo", 1));
        assertEquals("bar", kv.get("foo", 3));
        kv.set("foo", "bar2", 4);
        assertEquals("bar2", kv.get("foo", 4));
        assertEquals("bar2", kv.get("foo", 5));
        assertEquals("", kv.get("foo", 0));
    }

    @Test
    void test_2() {
        T981.TimeMap kv = new T981.TimeMap();
        kv.set("love", "high", 10);
        kv.set("love", "low", 20);
        assertEquals("high", kv.get("love", 10));
        assertEquals("high", kv.get("love", 15));
        assertEquals("low", kv.get("love", 20));
        assertEquals("low", kv.get("love", 25));
        assertEquals("", kv.get("foo", 0));
    }
}