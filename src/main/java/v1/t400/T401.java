package v1.t400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T401 {
    public List<String> readBinaryWatch(int turnedOn) {
        if (turnedOn > 9 || turnedOn < 0) {
            return Collections.emptyList();
        }

        List<List<String>> shi = new ArrayList<>();
        List<List<String>> fen = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            shi.add(new ArrayList<>());
            fen.add(new ArrayList<>());
        }

        for (int i = 0; i <= 11; i++) {
            int c = getCount(i);
            shi.get(c).add(String.valueOf(i));
            fen.get(c).add((i < 10 ? "0" : "") + i);
        }


        for (int i = 12; i <= 59; i++) {
            int c = getCount(i);
            fen.get(c).add(String.valueOf(i));
        }

        List<String> res = new ArrayList<>();
        for (int i = 0; i <= turnedOn && i <=4; i++) {
            int j = turnedOn - i;
            if (j > 5) {
                continue;
            }
            for (String x : shi.get(i)) {
                for (String y : fen.get(j)) {
                    String t = x + ":" + y;
                    res.add(t);
                }
            }
        }

        return res;
    }

    public int getCount(int x) {
        int res = 0;
        while (x > 0) {
            res += (x & 1);
            x >>= 1;
        }
        return res;
    }
}
