package v1.t800;

import java.util.*;

public class T815 {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target){
            return 0;
        }

        // key-车站 v-车
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < routes.length; i++) {
            for (int s : routes[i]) {
                if (map.containsKey(s)) {
                   map.get(s).add(i);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(s, list);
                }
            }
        }

        if (!map.containsKey(source)) {
            return -1;
        }

        Deque<Integer>[] deque = new Deque[2];
        deque[0] = new ArrayDeque<>();
        deque[1] = new ArrayDeque<>();
        int p = 0;
        int q = 1;

        Integer[] memo = new Integer[routes.length];
        for (Integer car : map.get(source)) {
            memo[car] = 1;
            deque[0].add(car);
        }

        int step = 2;
        while (!deque[p].isEmpty()) {
            while (!deque[p].isEmpty()) {
                Integer car = deque[p].poll();
                for (int s : routes[car]) {

                    if (s == target) {
                        return memo[car];
                    }

                    for (Integer nextCar : map.get(s)) {
                        if (memo[nextCar] == null) {
                            memo[nextCar] = step;
                            deque[q].add(nextCar);
                        }
                    }
                }
            }

            step++;
            p ^= 1;
            q ^= 1;
        }

        return -1;

    }
}
