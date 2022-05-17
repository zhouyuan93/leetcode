package v1.t900;

public class T953 {

    public int[] orderIndex = new int[26];
    public boolean isAlienSorted(String[] words, String order) {

        for (int i = 0; i < order.length(); i++) {
            orderIndex[order.charAt(i) - 'a'] = i;
        }

        String t = words[0];

        for (int i = 0; i < words.length; i++) {
            if (compare(t, words[i]) > 0) {
                return false;
            }

            t = words[i];
        }

        return true;
    }

    public int compare(String x, String y) {
        if (x.length() > y.length()) {
            return -compare(y, x);
        }

        for (int i = 0; i < x.length(); i++) {
            int res = orderIndex[x.charAt(i) - 'a'] - orderIndex[y.charAt(i) - 'a'];
            if (res > 0) {
                return 1;
            } else if (res < 0) {
                return -1;
            }
        }

        return x.length() == y.length() ? 0 : -1;
    }

}
