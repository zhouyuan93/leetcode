package v1.mst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST03_04Test {
    @Test
    void test_1() {
        MST03_04.MyQueue myQueue = new MST03_04.MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        assertEquals(1, myQueue.peek());
        myQueue.push(3);
        myQueue.push(4);
        assertEquals(1, myQueue.peek());
        assertEquals(1, myQueue.pop());
        assertEquals(2, myQueue.pop());
        assertEquals(false,myQueue.empty());
    }
}