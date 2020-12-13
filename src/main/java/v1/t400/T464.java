package v1.t400;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T464 {

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {

        if (desiredTotal <= maxChoosableInteger) {
            return true;
        }
        if ((1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal) {
            return false;
        }


        int key = (1 << maxChoosableInteger) - 1;
        int sum = 0;

        //按最大情况初始化
        Map<Integer, Boolean> memory = new HashMap<>((int) (Math.pow(2,maxChoosableInteger) / 0.7) + 1);
        boolean res = getMemory(key, sum, key, maxChoosableInteger, desiredTotal, memory);
        return res;

    }

    public boolean getMemory(int key, int sum, int maxKey, int len, int total, Map<Integer,Boolean> memory) {
        if (memory.containsKey(key)) {
            return memory.get(key);
        }

        // i表示当前人选择的数字
        for (int i = 1; i <= len; i++) {
            int x = 1 << (i-1) ;
            int keyNext = key & (x ^ maxKey);

            //keyNext没有变,则说明i已经选过了
            if (keyNext == key) {
                continue;
            }

            //选择i后达到目标
            int sumNext = sum + i;
            if (sumNext >= total) {
                memory.put(key, true);
                return true;
            }

            //当前人选择i后, 取下个一个人能否获胜
            boolean resNext = getMemory(keyNext, sumNext, maxKey, len, total, memory);
            if (resNext == false) {
                memory.put(key, true);
                return true;
            }

        }

        //所有情况都遍历过,没有返回true,说明赢不了
        memory.put(key, false);
        return false;
    }

}
