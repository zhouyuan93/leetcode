package v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T386 {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 10) {
            for (int i = 1; i <= n; i++) {
                res.add(i);
            }
            return res;
        }

        int last = 9;
        while (last * 10 + 9 < n) {
            last = last * 10 + 9;
        }
        if (last * 10 < n) {
            last = last * 10 + n % 10;
        }

        Integer p = 1;
        while (p != last) {
            res.add(p);
            p = getNext(p, n);
        }

        res.add(last);

        return res;

    }

    public Integer getNext(int p, int max) {

        //x = x * 10
        int temp = p * 10;
        if (temp <= max) {
            return temp;
        }

        //x = x + 1
        temp = p + 1;
        if (temp <= max) {
            while (temp % 10 == 0) {
                temp /= 10;
            }
            return temp;
        }

        //p = max
        temp = p / 10;
        while (temp % 10 == 9) {
            temp = temp / 10;
        }
        return temp+1;

    }
}
