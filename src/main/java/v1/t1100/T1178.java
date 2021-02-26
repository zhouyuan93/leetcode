package v1.t1100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T1178 {
    public static final int MAX_KEY = 2 << 26 - 1;

    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int key = 0;
            for (int j = 0; j < words[i].length(); j++) {
                key |= (1 << (words[i].charAt(j) - 'a'));
            }
            if (Integer.bitCount(key) <= 7) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int x = 0; x < puzzles.length; x++) {
            String puzzle = puzzles[x];
            int count = 0;

            int puzzlesKey = 0;
            for (int j = 1; j < 7; j++) {
                puzzlesKey |= (1 << (puzzle.charAt(j) - 'a'));
            }


            int subset = puzzlesKey;
            do {
                int s = subset | (1 << (puzzle.charAt(0) - 'a'));
                if (map.containsKey(s)) {
                    count += map.get(s);
                }
                subset = (subset - 1) & puzzlesKey;
            } while (subset != puzzlesKey);

            res.add(count);
        }

        return res;

    }

}
