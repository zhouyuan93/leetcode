package v1.t400;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class T436 {
    class Node {
        int start;
        int index;

        public Node(int start, int index) {
            this.start = start;
            this.index = index;
        }
    }

    public int[] findRightInterval(int[][] intervals) {
        int[] res = new int[intervals.length];

        Node[] memo = new Node[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            memo[i] = new Node(intervals[i][0], i);
        }

        Arrays.sort(memo, Comparator.comparingInt(a -> a.start));

        for (int i = 0; i < intervals.length; i++) {
            res[i] = find(memo, intervals[i][1]);
        }

        return res;

    }

    public int find(Node[] nodes, int target) {
        int l = 0;
        int r = nodes.length ;
        int mid;

        if (nodes[l].start >= target) {
            return nodes[l].index;
        }
        while (r - 1 > l) {
            mid = (l + r) / 2;
            if (nodes[mid].start > target) {
                r = mid;
            } else if (nodes[mid].start < target) {
                l = mid;
            } else {
                return nodes[mid].index;
            }
        }

        if (r == nodes.length) {
            return -1;
        }

        return nodes[r].index;
    }
}
