package v1.t200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T241 {
    public List<Integer> diffWaysToCompute(String input) {
        HashMap<String, List<Integer>> map = new HashMap<>();

        return getList(map, input, 0 , input.length()-1);

    }

    public List<Integer> getList(HashMap<String, List<Integer>> map, String input, int begin , int end) {
        String key = begin + "-" + end;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            char c = input.charAt(i);
            if (c == '-' || c == '*' || c == '+') {
                List<Integer> listA = getList(map, input, begin, i - 1);
                List<Integer> listB = getList(map, input, i + 1, end);
                merge(listA, listB, res, c);
            }
        }

        if (res.isEmpty()) {
            res.add(Integer.parseInt(input.substring(begin, end + 1)));
        }

        map.put(key , res);
        return res;
    }

    public void merge(List<Integer> listA, List<Integer> listB, List<Integer> res, char x) {
        for (Integer a : listA) {
            for (Integer b : listB) {
                res.add(calc(a, b, x));
            }
        }
    }

    public int calc(int a, int b, char x) {
        switch (x) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                throw new RuntimeException("not found" + x);
        }
    }


}
