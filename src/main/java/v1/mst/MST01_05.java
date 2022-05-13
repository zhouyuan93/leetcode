package v1.mst;

public class MST01_05 {

    public boolean oneEditAway(String first, String second) {
        int dif = first.length() - second.length();
        if (dif >= 2 || dif <= -2) {
            return false;
        }

        if (dif == 0) {
            int len = first.length();
            boolean change = false;
            for (int i = 0; i < len; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (change) {
                        return false;
                    }
                    change = true;
                }
            }
        }

        if (dif < 0) {
            String temp = first;
            first = second;
            second = temp;
            dif *= -1;
        }

        if (dif > 0) {
            int len1 = first.length();
            int len2 = second.length();
            boolean change = false;
            for (int i = 0, j = 0; i < len1 && j < len2; i++, j++) {
                if (first.charAt(i) != second.charAt(j)) {
                    if (change) {
                        return false;
                    }
                    i++;
                    if (first.charAt(i) != second.charAt(j)) {
                        return false;
                    }
                    change = true;
                }
            }
        }

        return true;
    }
}
