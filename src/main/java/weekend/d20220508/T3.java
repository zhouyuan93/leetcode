package weekend.d20220508;

import java.util.HashMap;
import java.util.Map;

public class T3 {
    int[] trans = {1,1,3,3,3,3,3,4,3,4};

    long MOD = 1000000000 + 7;

    Map<Integer, Long> map = new HashMap<>();

    public int countTexts(String pressedKeys) {
        if (pressedKeys.length() == 0) {
            return 0;
        }
        long res = 1;

        int count = 1;
        char c = pressedKeys.charAt(0);

        for (int i = 1; i < pressedKeys.length(); i++) {
            char t = pressedKeys.charAt(i);
            if (t != c) {
                res = res * calc(count, trans[c - '0']) % MOD;
                c = t;
                count = 1;
            }else{
                count++;
            }
        }

        res = res * calc(count, trans[c - '0']) % MOD;

        return (int) res;
    }

    public long calc(int len, int tran) {


        int key = len * 10 + tran;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        long val = 0;
        for (int i = 1; i <= tran; i++) {
            if (len - i < 0) {
                break;
            }else if(len - i == 0){
                val++;
                val %= MOD;
                break;
            }
            val += calc(len - i, tran);
            val %= MOD;
        }
        map.put(key, val);

        return val;
    }


}
