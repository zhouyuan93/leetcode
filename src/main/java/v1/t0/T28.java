package v1.t0;

public class T28 {
    public int strStr2(String haystack, String needle) {
        if (needle == null || "".equals(needle)) {
            return 0;
        }
        char[] charNeedle = needle.toCharArray();
        char[] charHaystack = haystack.toCharArray();
        for (int i = 0; i < charHaystack.length - charNeedle.length + 1; i++) {
            int p = 0;
            for (int j = i; j < i + charNeedle.length; j++) {
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

    public int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)) {
            return 0;
        }
        int[] kmpNextArray = getKmpNextArray(needle.toCharArray());
        int i = 0;
        int j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = kmpNextArray[j];
            }
        }

        return j == needle.length() ? i - j : -1;
    }

    /**
     * next数组含义: 当前idx不匹配时, 可以往前跳到哪里
     * ABCABC -1,0,0,0,1,2,
     * 0_A -1;
     * 1_B -0;
     * 2_C 匹配失败 当前串为 AB* , 没有节约的可能
     * 3_A 匹配失败 当前串为 ABC*, 没有节约的可能
     * 4_B 匹配失败 当前串为 ABCA* , 应该从1_B的位置比较* ,
     *
     * @param t
     * @return
     */
    public int[] getKmpNextArray(char[] t) {
        if (t.length < 2) {
            return new int[]{0};
        }
        int[] next = new int[t.length];
        next[0] = -1;
        next[1] = 0;
        int k;
        for (int p = 2; p < t.length; p++) {
            // 当前指针前一个字母对应的 next
            k = next[p - 1];
            while (k != -1) {
                // 当前指针前一个字母 和 前一个字母对应的next位置字母 是否相同
                if (t[p - 1] == t[k]) {
                    // 如果相同 当前指针对应的next 取前一个字母对应的 next+1
                    next[p] = k + 1;
                    break;
                } else {
                    // 不相同 k 取 前一个字母对应的next 的 next
                    k = next[k];
                }
                // 将当前指针对应
                next[p] = 0;
            }
        }
        return next;
    }
}
