package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MST10_02Test {
    
    MST10_02 t;

    @BeforeEach
    void setUp() {
        t = new MST10_02();
    }

    @Test
    void test_1() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> a = t.groupAnagrams(strs);
        System.out.println(a);
    }
}