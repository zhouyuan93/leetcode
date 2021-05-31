package v1.t1700;

public class T1791 {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        int c = edges[1][0];
        if (a == c) {
            return a;
        } else if (b == c) {
            return b;
        }else{
            return edges[1][1];
        }
    }
}
