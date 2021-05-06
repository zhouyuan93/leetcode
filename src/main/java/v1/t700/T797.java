package v1.t700;

import java.util.ArrayList;
import java.util.List;

public class T797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length - 1;

        List<List<Integer>> res = new ArrayList<>();

        int[] array = new int[15];
        int len = 0;

        find(res, array, len, 0, n, graph);

        return res;
    }

    public void find(List<List<Integer>> res, int[] arr, int len, int p, int target, int[][] graph) {
        if (p == target) {
            arr[len++] = p;
            res.add(getList(arr, len));
            return;
        }

        arr[len++] = p;
        for (int i = 0; i < graph[p].length; i++) {
            find(res, arr, len, graph[p][i], target, graph);
        }
    }

    public List<Integer> getList(int[] arr, int len) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
