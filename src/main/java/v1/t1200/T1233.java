package v1.t1200;

import java.util.*;

public class T1233 {
    class Node{
        boolean exists;
        String name;
        Map<String,Node> map ;

        public Node(String name) {
            this.name = name;
            this.map = new HashMap<>();
            this.exists = false;
        }
    }
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);

        List<String> res = new ArrayList<>();

        Node root = new Node("");

        for (String s : folder) {
            String[] split = s.split("/");

            Node p = root;
            for (int i = 1; i < split.length; i++) {
                String n = split[i];
                if (p.map.containsKey(n) ) {
                    p = p.map.get(n);
                    if (p.exists) {
                        break;
                    }
                }else{
                    Node temp = new Node(n);
                    p.map.put(n, temp);
                    p = temp;
                }
                if (i == split.length - 1) {
                    res.add(s);
                    p.exists=true;
                }
            }
        }

        return res;
    }
}
