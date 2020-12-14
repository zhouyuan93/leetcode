package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class T49Test {
    T49 t;

    @BeforeEach
    void setUp() {
        t = new T49();
    }

    @Test
    void test_1() {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> actual = t.groupAnagrams(str);
        assertEquals(3, actual.size());
        for (int i = 0; i < actual.size(); i++) {
            System.out.println(actual.get(i).toString());
        }
    }
}