package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MST08_04Test {

    MST08_04 t;

    @BeforeEach
    void setUp() {
        t = new MST08_04();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> actual = t.subsets(nums);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(2,3));
        expected.add(Arrays.asList(1,3));
        expected.add(Arrays.asList(1, 2, 3));
        actual.forEach(list -> list.sort(Comparator.naturalOrder()));
        actual.sort(Comparator.comparingInt(a -> a.size() > 0 ? a.get(0) : 0));
        expected.forEach(list -> list.sort(Comparator.naturalOrder()));
        expected.sort(Comparator.comparingInt(a -> a.size() > 0 ? a.get(0) : 0));
        assertEquals(expected.size(), actual.size());
        assertEquals(expected.toString(), actual.toString());
    }
}