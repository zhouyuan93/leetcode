package v1.t900;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T933Test {

    @Test
    void test_1() {
        T933.RecentCounter recentCounter = new T933.RecentCounter();
        assertEquals(1,recentCounter.ping(1));
        assertEquals(2,recentCounter.ping(100));
        assertEquals(3,recentCounter.ping(3001));
        assertEquals(3,recentCounter.ping(3002));
    }
}