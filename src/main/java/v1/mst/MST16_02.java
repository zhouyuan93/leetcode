package v1.mst;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class MST16_02 {
    static class WordsFrequency {
        Map<String, Integer> books;

        public WordsFrequency(String[] book) {
            books  = new HashMap<>((int) (book.length / 0.75));
            for (String s : book) {
                books.put(s, books.getOrDefault(s, 0) + 1);
            }
        }

        public int get(String word) {
            return books.getOrDefault(word, 0);
        }
    }
}
