package v1.t700;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class T710Test {

    T710 t = new T710();

    @Test
    void test_1() {

        int n = 7;
        int[] blacklist = {2, 3, 5};

        T710.Solution solution = new T710.Solution(n, blacklist);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int x = solution.pick();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map.toString());

    }

    @Test
    void test_2() {

        int n = 8;
        int[] blacklist = {2, 3, 4, 5, 7};

        T710.Solution solution = new T710.Solution(n, blacklist);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int x = solution.pick();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map.toString());

    }
}