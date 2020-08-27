package v1.t300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author yuan.zhou
 */
public class T332 {
    Map<String, PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
    List<String> res = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0);
            String dst = ticket.get(1);
            PriorityQueue<String> queue = map.getOrDefault(src, new PriorityQueue<String>());
            queue.offer(dst);
            map.put(src, queue);
        }
        dfs("JFK");
        Collections.reverse(res);
        return res;
    }

    public void dfs(String curr) {
        while (map.getOrDefault(curr, new PriorityQueue<>()).size() > 0) {
            String temp = map.get(curr).poll();
            dfs(temp);
        }
        res.add(curr);
    }



}
