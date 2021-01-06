package v1.t300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author yuan.zhou
 */
public class T399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Integer> mapIndex = new HashMap<>();
        List<Map<String, Double>> list = new ArrayList<>();

        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            Double val = values[i];
            int aIndex = mapIndex.getOrDefault(a, -1);
            int bIndex = mapIndex.getOrDefault(b, -1);
            if (aIndex == -1 && bIndex == -1) {
                Map<String, Double> map = new HashMap<>();
                map.put(b, 1D);
                map.put(a, val);
                int index = list.size();
                list.add(map);
                mapIndex.put(a, index);
                mapIndex.put(b, index);
            } else if (aIndex >= 0 && bIndex == -1) {
                Map<String, Double> map = list.get(aIndex);
                map.put(b, map.get(a)/val);
                mapIndex.put(b, aIndex);
            } else if (bIndex >= 0 && aIndex == -1) {
                Map<String, Double> map = list.get(bIndex);
                map.put(a, map.get(b) * val);
                mapIndex.put(a, bIndex);
            } else if (bIndex >= 0 && aIndex >= 0) {
                Map<String, Double> aMap = list.get(aIndex);
                Map<String, Double> bMap = list.get(bIndex);
                val = val * list.get(bIndex).get(b) / list.get(aIndex).get(a);
                for (Map.Entry<String, Double> entry : aMap.entrySet()) {
                    String s = entry.getKey();
                    Double sVal = entry.getValue() * val;
                    mapIndex.put(s, bIndex);
                    bMap.put(s, sVal);
                }
            }
        }

        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String a = query.get(0);
            String b = query.get(1);
            int aIndex = mapIndex.getOrDefault(a, -1);
            int bIndex = mapIndex.getOrDefault(b, -1);
            if (aIndex == -1 || bIndex == -1 || aIndex != bIndex) {
                res[i] = -1;
            }else{
                Double aVal = list.get(aIndex).get(a);
                Double bVal = list.get(bIndex).get(b);
                res[i] = aVal / bVal;
            }
        }

        return res;
    }

}
