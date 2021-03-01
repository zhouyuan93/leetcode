package v1.t1400;

import java.util.HashMap;

/**
 * @author yuan.zhou
 */
public class T1487 {
    public String[] getFolderNames(String[] names) {
        HashMap<String, Integer> map = new HashMap<>((int) (names.length / 0.75));
        String[] ans = new String[names.length];

        int i=0;
        for (String name : names) {
            if (map.containsKey(name)) {
                int val = map.get(name);
                String newName = name + "(" + val + ")";
                while(map.containsKey(newName)){
                    val++;
                    newName = name + "(" + val + ")";
                }
                map.put(name, val + 1);
                map.put(newName, 1);
                ans[i++] = newName;
            }else{
                map.put(name, 1);
                ans[i++] = name;
            }
        }

        return ans;

    }
}
