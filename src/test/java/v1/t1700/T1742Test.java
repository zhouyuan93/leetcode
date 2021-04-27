package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1742Test {

    T1742 t;

    @BeforeEach
    void setUp() {
        t = new T1742();
    }

    @Test
    void test_1() {
        T1742.BrowserHistory browserHistory = new T1742.BrowserHistory("111");
        browserHistory.visit("222");
        browserHistory.visit("333");
        browserHistory.visit("444");
        assertEquals("333",browserHistory.back(1));
        assertEquals("222",browserHistory.back(1));
        assertEquals("333",browserHistory.forward(1));
        browserHistory.visit("555");
        assertEquals("333",browserHistory.back(1));
    }
}