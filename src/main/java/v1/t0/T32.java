package v1.t0;

import java.util.*;

public class T32 {
    class Node {
        public int index;
        public int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    // )  ( )  ( )  )  (  ( ( ( ) ) )  )
    // 0 -1 0 -1 0 -1 -2 -1 0 1 2 1 0 -1 -2
    public int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        int[] memo = new int[chars.length];

        Map<Integer, List<Integer>> valueToIndex = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue<Node>((x, y) -> x.value == y.value ? y.index - x.index : y.value - x.value);

        int res = 0;

        int t = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                queue.add(new Node(i, t));

                if (valueToIndex.containsKey(t)) {
                    valueToIndex.get(t).add(i);
                }else{
                    List<Integer> arr = new ArrayList<>();
                    arr.add(i);
                    valueToIndex.put(t,arr);
                }
                t++;
            } else {
                t--;
                while (!queue.isEmpty() && queue.peek().value > t) {
                    Node n = queue.poll();
                    if (valueToIndex.get(n.value).size() == 1) {
                        valueToIndex.remove(n.value);
                    }else{
                        valueToIndex.get(n.value).remove(Integer.valueOf(n.index));
                    }
                }
                if (valueToIndex.containsKey(t)) {
                    List<Integer> list = valueToIndex.get(t);
                    if (!list.isEmpty()) {
                        res = Math.max(res, i - list.get(0) + 1);
                    }
                }
            }
        }

        return res;
    }
}
