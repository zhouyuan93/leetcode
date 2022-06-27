package v1.t1900;

public class T1910 {
    public String removeOccurrences(String s, String part) {
        String res = s.replaceFirst(part, "");
        String t = res.replaceFirst(part, "");
        while (!t.equals(res)) {
            res = t;
            t = res.replaceFirst(part, "");
        }

        return res;
    }
}
