package algorithm.disjointset;

/**
 * 并查集模板
 */
public class DisJointSet {

    // 父节点
    private int[] fa;

    // 各个节点的秩
    private int[] rank;

    public DisJointSet(int n) {
        fa = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            fa[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        return x == fa[x] ? x : (fa[x] = find(fa[x]));
    }

    public void union(int i, int j) {
        int x = find(i);
        int y = find(j);

        // 比较秩
        if (rank[x] <= rank[y]) {
            fa[x] = y;
        }else{
            fa[y] = x;
        }

        // 如果两个秩不相同, 不会影像
        // 当两个秩相同, 由于是y做fa, 接在x后边, 所以y的秩+1
        if (rank[x] == rank[y] && x != y) {
            rank[y]++;
        }
    }
}
