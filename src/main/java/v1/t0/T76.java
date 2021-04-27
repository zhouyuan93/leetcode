package v1.t0;

public class T76 {
    public String minWindow(String s, String t) {
        int[] sArr = new int[52];
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            int idx = getIdx(t.charAt(i));
            if (sArr[idx]-- == 0) {
                count++;
            }
        }

        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = getIdx(s.charAt(i));
            if (sArr[idx] < 0) {
                left = i;
                break;
            }
        }

        int resLeft = 0;
        int resRight = s.length();

        for (int i = left; i < s.length(); i++) {
            int idx = getIdx(s.charAt(i));
            if (sArr[idx]++ == -1) {
                if (count-- == 1) {
                    while (left < i) {
                        if (sArr[getIdx(s.charAt(left))] <= 0) {
                            break;
                        }else{
                            sArr[getIdx(s.charAt(left++))]--;
                        }
                    }
                    resLeft = left;
                    resRight = i;
                }
            }
            if (count == 0 && s.charAt(i) == s.charAt(left)) {
                while (left < i) {
                    if (sArr[getIdx(s.charAt(left))] <= 0) {
                        break;
                    }else{
                        sArr[getIdx(s.charAt(left++))]--;
                    }
                }
                if (i - left < resRight - resLeft) {
                    resRight = i;
                    resLeft = left;
                }
            }
        }

        if (count == 0) {
            return resRight + 1 <= s.length() ? s.substring(resLeft, resRight + 1) : s.substring(resLeft);
        }else{
            return "";
        }

    }

    public int getIdx(char c) {
        return c >= 'a' ? c - 'a' : c - 'A' + 26;
    }
}
