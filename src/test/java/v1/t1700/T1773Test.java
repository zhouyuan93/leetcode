package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1773Test {

    T1773 t;

    @BeforeEach
    void setUp() {
        t = new T1773();
    }

    @Test
    void test_1() {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "color", ruleValue = "silver";
        int actual = t.countMatches(items, ruleKey, ruleValue);
        int expected = 1;
        assertEquals(expected, actual);
    }
}