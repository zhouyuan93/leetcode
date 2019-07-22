package v1;

public class T28 {
    public static void main(String[] args) {
        String haystack = "issip";
        String needle = "issip";

        T28 t = new T28();
        int start = t.strStr(haystack, needle);
        System.out.println(start);

    }
    public int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)) {
            return 0;
        }
        char[] charNeedle = needle.toCharArray();
        char[] charHaystack = haystack.toCharArray();
        for (int i = 0 ; i < charHaystack.length - charNeedle.length + 1 ; i++) {
            int p = 0;
            for(int j = i; j < i+charNeedle.length; j++) {
                if (charHaystack[j] == charNeedle[p]) {
                    p++;
                } else {
                    break;
                }
            }
            if (p == charNeedle.length) {
                return i;
            }
        }
        return -1;
    }
}
