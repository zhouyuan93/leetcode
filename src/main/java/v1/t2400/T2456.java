package v1.t2400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T2456 {
    class Node {
        long maxViews;

        String id;

        public Node() {
            this.maxViews = -1;
            this.id = null;
        }
    }

    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        int len = creators.length;

        Map<String, Long> creatorsView = new HashMap<>();
        Map<String, Node> nodes = new HashMap<>();

        for (int i = 0; i < len; i++) {
            String creator = creators[i];
            String id = ids[i];
            int view = views[i];

            creatorsView.put(creator, creatorsView.getOrDefault(creator, 0L) + view);

            Node node = nodes.getOrDefault(creator, new Node());
            if (view > node.maxViews) {
                node.maxViews = view;
                node.id = id;
            } else if (view == node.maxViews) {
                node.id = compare(id, node.id);
            }
            nodes.put(creator, node);
        }

        long max = 0;
        List<String> cs = new ArrayList<>();

        for (Map.Entry<String, Long> entry : creatorsView.entrySet()) {
            Long v = entry.getValue();
            if (v > max) {
                max = v;
                cs.clear();
                cs.add(entry.getKey());
            } else if (v == max) {
                cs.add(entry.getKey());
            }
        }

        List<List<String>> res = new ArrayList<>();
        for (String creator : cs) {
            res.add(Arrays.asList(creator, nodes.get(creator).id));
        }

        return res;
    }

    private String compare(String x, String y) {
        if (x.length() > y.length()) {
            return compare(y, x);
        }
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) < y.charAt(i)) {
                return x;
            } else if (x.charAt(i) > y.charAt(i)) {
                return y;
            }
        }

        return x;
    }
}
