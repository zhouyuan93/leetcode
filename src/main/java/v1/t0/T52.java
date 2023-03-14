package v1.t0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T52 {
    List<List<String>> res;

    List<String> template;

    int n;

    public int totalNQueens(int n) {
        this.n = n;
        res = new ArrayList<>();
        template = getTemplate(n);

        int[] idx = new int[n];

        int col = (1 << (n)) - 1;
        int s1 = (1 << (2 * n - 1)) - 1;
        int s2 = (1 << (2 * n - 1)) - 1;

        testQueue(idx, 0, col, s1, s2);


        return res.size();
    }

    private void testQueue(int[] idx, int p, int col, int s1, int s2) {
        if (p >= n) {
            transAdd(idx);
            return;
        }
        int y = p;
        int t = col;
        while (t > 0) {
            int h = t & -t;
            int x = getX(h);
            t -= h;
            int z1 = 1 << (x + y);
            int z2 = 1 << (x + n - 1 - y);
            if ((z1 & s1) != z1 || (z2 & s2) != z2) {
                continue;
            }

            idx[y] = x;
            col -= h;
            s1 -= z1;
            s2 -= z2;
            testQueue(idx, p + 1, col, s1, s2);
            col += h;
            s1 += z1;
            s2 += z2;
        }
    }

    public int getX(int t) {
        int x = -1;
        while (t > 0) {
            x++;
            t >>= 1;
        }
        return x;
    }

    private List<String> getTemplate(int n) {
        List<String> res = new ArrayList<>();
        char[] c = new char[n];
        Arrays.fill(c, '.');
        for (int i = 0; i < n; i++) {
            c[i] = 'Q';
            res.add(new String(c));
            c[i] = '.';
        }
        return res;
    }


    public void transAdd(int[] idx) {
        List<String> l = new ArrayList<>();
        for (int i = 0; i < idx.length; i++) {
            l.add(template.get(idx[i]));
        }
        this.res.add(l);
    }
}
