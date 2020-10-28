package v1.t1200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author yuan.zhou
 */
public class T1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> arrMap = Arrays.stream(arr).collect(() -> new HashMap<>(),
                (map, a) -> map.put(a, map.getOrDefault(a, 0) + 1),
                (m, n) -> n.entrySet()
                        .forEach(entry -> m.put(entry.getKey(),
                                m.getOrDefault(entry.getKey(), 0) + entry.getValue())));
        int size = arrMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toSet()).size();
        return arrMap.size() == size;
    }
}
