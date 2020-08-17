package v1.t1200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T1239 {
    public int maxLength(List<String> arr) {

        if (arr == null || arr.size() == 0) {
            return 0;
        }

        List<Integer> arrIntList = new ArrayList<>();
        for (String s : arr) {
            int x = transStrToInt(s);
            arrIntList.add(x);
        }

        return maxLength(arrIntList,arr, 0, 0);

    }

    public int maxLength(List<Integer> arrIntList, List<String> arr, int start, int mark) {
        if (start == arrIntList.size()) {
            return 0;
        }

        int res = 0;
        for (int i = start; i < arrIntList.size(); i++) {
            int strInt = arrIntList.get(i);

            if (strInt == -1 || (mark & strInt) != 0) {
                continue;
            }

            res = Math.max(res, maxLength(arrIntList,arr, i + 1, mark | strInt) + arr.get(i).length());

        }

        return res;

    }

    /**
     * 转换字符串到int
     * @param s 字符串
     * @return -1 字符串内部重复 >0 非重复字符串
     */
    public int transStrToInt(String s) {
        char[] cs = s.toCharArray();

        int res = 0;

        for (char c : cs) {
            int i = 1 << (c - 'a');
            int temp = res | i;
            if (temp == res) {
                return -1;
            }
            res = temp;
        }

        return res;
    }

}
