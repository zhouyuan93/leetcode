package v1.t1400;

import java.util.HashSet;
import java.util.List;

public class T1436 {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for (List<String> path : paths) {

            if (set2.contains(path.get(1))) {
                set2.remove(path.get(1));
            } else {
                set1.add(path.get(0));
            }

            if (set1.contains(path.get(1))) {
                set1.remove(path.get(1));
            }else{
                set2.add(path.get(1));
            }

        }

        for (String s : set1) {
            set2.remove(s);
        }


        String s = "";
        for (String str : set2) {
            s = str;
            break;
        }

        return s;
    }
}
