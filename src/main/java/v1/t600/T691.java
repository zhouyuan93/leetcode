package v1.t600;

import java.util.*;

public class T691 {

    int res;

    public int minStickers(String[] stickers, String t) {
        Set<Integer> set = new HashSet<>();
        Node target = new Node(t,set);

        List<Node> list = new ArrayList<>();

        for (String sticker : stickers) {
            Node node = new Node(sticker,target.memo, set);
            if (node.weight > 0) {
                boolean needAdd = true;
                for (int i = list.size()-1; i >= 0; i--) {
                    Node p = list.get(i);
                    int r = contains(node, p);
                    if (r == 1) {
                        needAdd = true;
                        list.remove(i);
                    } else if (r == -1) {
                        needAdd = false;
                        break;
                    }
                }
                if (needAdd) {
                    list.add(node);
                }
            }
        }

        if (!set.isEmpty()) {
            return -1;
        }

        list.sort((x, y) -> y.weight - x.weight);

        res = t.length() - list.get(0).weight + 1;

        dfs(list, target, 0, 0);

        return res;
    }


    public void dfs(List<Node> list, Node target, int p, int count) {
        if (count >= res) {
            return;
        }

        boolean isZero = true;
        for (int i : target.memo) {
            if (i > 0) {
                isZero = false;
                break;
            }
        }
        if (isZero) {
            res = Math.min(res, count);
        }

        for (int i = p; i < list.size(); i++) {
            Node node = list.get(i);

            boolean contains = false;
            for (int j = 0; j < 26; j++) {
                if (node.memo[j] > 0 && target.memo[j] > 0) {
                    contains = true;
                    break;
                }
            }

            if (!contains) {
                continue;
            }

            for (int j = 0; j < 26; j++) {
                target.memo[j] -= node.memo[j];
            }
            dfs(list, target, i, count + 1);
            for (int j = 0; j < 26; j++) {
                target.memo[j] += node.memo[j];
            }
        }
    }

    private int contains(Node m, Node n) {
        boolean mMax = true;
        boolean nMax = true;
        for (int i = 0; i < 26 && (mMax || nMax); i++) {
            if (m.memo[i] > n.memo[i]) {
                nMax = false;
            } else if (m.memo[i] < n.memo[i]) {
                mMax = false;
            }
        }
        if (mMax) {
            return 1;
        }
        if (nMax) {
            return -1;
        }
        return 0;
    }

    class Node {
        int[] memo;
        int weight;

        public Node(String str, int[] target, Set<Integer> set) {
            memo = new int[26];
            for (int i = 0; i < str.length(); i++) {
                int idx = str.charAt(i) - 'a';
                if (target[idx] > 0) {
                    memo[idx]++;
                }
            }
            for (int i = 0; i < memo.length; i++) {
                if (memo[i] > 0) {
                    weight += Math.min(memo[i], target[i]);
                    set.remove(i);
                }
            }
        }

        public Node(String str, Set<Integer> set) {
            memo = new int[26];
            for (int i = 0; i < str.length(); i++) {
                int idx = str.charAt(i) - 'a';
                memo[idx]++;
                set.add(idx);
            }
        }
    }

}
