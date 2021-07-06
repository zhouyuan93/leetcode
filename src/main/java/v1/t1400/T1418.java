package v1.t1400;

import java.util.*;

public class T1418 {

    public List<List<String>> displayTable(List<List<String>> orders) {
        HashSet<String> menu = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
        List<String> head = new ArrayList<>();

        Map<Integer, Map<String, Integer>> display = new HashMap<>();

        for (List<String> order : orders) {
            Integer num = Integer.valueOf(order.get(1));
            String dish = order.get(2);

            if (menu.add(dish)) {
                head.add(dish);
            }
            Map<String, Integer> table = display.getOrDefault(num, new HashMap<>());
            int count = table.getOrDefault(dish, 0) + 1;
            table.put(dish, count);
            display.put(num, table);
        }

        head.sort(Comparator.naturalOrder());

        for (Map.Entry<Integer, Map<String, Integer>> entry : display.entrySet()) {
            List<String> t = new ArrayList<>();
            t.add(String.valueOf(entry.getKey()));

            for (String s : head) {
                t.add(String.valueOf(entry.getValue().getOrDefault(s, 0)));
            }
            res.add(t);
        }

        res.sort(Comparator.comparingInt(l -> Integer.parseInt(l.get(0))));
        head.add(0,"Table");
        res.add(0,head);

        return res;

    }
}
