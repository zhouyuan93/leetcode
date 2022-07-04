package v1.t900;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T911Test {

    @Test
    void test() {
        int[] persons = {0, 1, 1, 0, 0, 1, 0};
        int[] times = {0, 5, 10, 15, 20, 25, 30};
        T911.TopVotedCandidate t = new T911.TopVotedCandidate(persons, times);

        System.out.println(Arrays.toString(persons));
        assertEquals(0,t.q(3));
        assertEquals(1,t.q(12));
        assertEquals(1,t.q(25));
        assertEquals(0,t.q(15));
        assertEquals(0,t.q(24));
        assertEquals(1,t.q(8));
    }
}