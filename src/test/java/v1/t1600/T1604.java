package v1.t1600;

import java.util.*;
import java.util.stream.Collectors;

public class T1604 {
    class Key {
        String name;
        int time;

        public Key(String keyName, String keyTime) {
            this.time = Integer.parseInt(keyTime.substring(0, 2)) * 60
                    + Integer.parseInt(keyTime.substring(3));
            this.name = keyName;
        }
    }

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        Set<String> res = new HashSet<>();

        List<Key> list = new ArrayList<>();
        for (int i = 0; i < keyName.length; i++) {
            list.add(new Key(keyName[i], keyTime[i]));
        }

        list.sort(Comparator.comparingInt(p -> p.time));

        Queue<Key> queue = new ArrayDeque<>();
        Map<String, Integer> map = new HashMap<>();
        map.put(list.get(0).name, 1);
        queue.offer(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            Key k = list.get(i);

            while (queue.peek() !=null && queue.peek().time < k.time - 60) {
                Key p = queue.poll();
                map.put(p.name, map.get(p.name) - 1);
            }

            queue.add(k);
            map.put(k.name, map.getOrDefault(k.name, 0) + 1);
            if (map.get(k.name) >= 3) {
                res.add(k.name);
            }

        }

        return res.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

    }
}
