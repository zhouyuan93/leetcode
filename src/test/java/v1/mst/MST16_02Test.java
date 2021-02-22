package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST16_02Test {

    MST16_02 t;

    @BeforeEach
    void setUp() {
        t = new MST16_02();
    }

    @Test
    void test_1() {
        MST16_02.WordsFrequency wordsFrequency = new MST16_02.WordsFrequency(new String[]{
                "i", "have", "an", "apple", "he", "have", "a", "pen"});
        assertEquals(0,wordsFrequency.get("you"));
        assertEquals(2, wordsFrequency.get("have"));
        assertEquals(1, wordsFrequency.get("an"));
        assertEquals(1, wordsFrequency.get("apple"));
        assertEquals(1, wordsFrequency.get("pen"));
    }
}