package v1.t1700;

public class T1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        Integer x = null;
        boolean change = false;

        int len = s1.length();

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (change) {
                    return false;
                }

                if (x == null) {
                    x = i;
                }else{
                    if (s1.charAt(x) == s2.charAt(i) && s1.charAt(i) == s2.charAt(x)) {
                        x = null;
                        change = true;
                    }else{
                        return false;
                    }
                }
            }
        }

        if (x != null) {
            return false;
        }

        return true;

    }
}
