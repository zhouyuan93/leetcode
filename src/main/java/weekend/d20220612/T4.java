package weekend.d20220612;

import java.util.HashSet;
import java.util.Set;

public class T4 {

    public static final String[] m = {"a", "b", "c", "d", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"
            , "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "x"};
    public long distinctNames(String[] ideas) {
        Set<String> set = new HashSet<>();
        for (String idea : ideas) {
            set.add(idea);
        }

        long res = 0;
        int n = set.size();

        for (String s : set) {
            int c = 0;
            for (int i = 0; i < 26; i++) {
                String t = m[i] + s.substring(1);
                if (set.contains(t)) {
                    c++;
                }
            }
            res += (n - c);
        }

        return res;

    }
}
