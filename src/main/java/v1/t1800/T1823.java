package v1.t1800;

import java.util.ArrayList;
import java.util.List;

public class T1823 {
    public int findTheWinner2(int n, int k) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int p = 0;
        while (list.size() > 1) {
            n = list.size();
            n = (p + k) % n - 1;
            if (n < 0) {
                n = list.size()-1;
            }
            p = n;
            list.remove(n);
        }
        return list.get(0);
    }

    public int findTheWinner(int n, int k) {
        k--;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int p = 0;
        while (list.size() > 1) {
            int len = list.size();
            p +=(k % len);
            if (p >= len) {
                p -= len;
            }
            list.remove(p);
        }

        return list.get(0);
    }
}
