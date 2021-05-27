package v1.t800;

public class T859 {
    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        Character ax = null;
        Character bx = null;
        boolean isChange = false;
        boolean hasSame = false;
        int[] memo = new int[26];
        for (int i = 0; i < a.length(); i++) {
            if (!hasSame) {
                int idx = a.charAt(i) - 'a';
                if (memo[idx] > 0) {
                    hasSame = true;
                }
                memo[idx]++;
            }
            if (a.charAt(i) != b.charAt(i)) {
                if (isChange) {
                    return false;
                }
                if (ax == null) {
                    ax = a.charAt(i);
                    bx = b.charAt(i);
                } else {
                    isChange = true;
                    if (a.charAt(i) != bx || b.charAt(i) != ax) {
                        return false;
                    }
                    ax = null;
                    bx = null;
                }
            }
        }

        return isChange  || (ax == null && hasSame);

    }
}
