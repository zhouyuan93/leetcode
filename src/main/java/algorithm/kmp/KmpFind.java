package algorithm.kmp;

import java.util.Arrays;

public class KmpFind {
    public static void main(String[] args) {
        KmpFind t = new KmpFind();
        System.out.println(Arrays.toString(t.getNextArray("aac".toCharArray())));

        String s = "aaac";
        String pat = "aac";
        System.out.println(s.indexOf(pat));
        System.out.println(t.kmp2(s,pat));
    }


    public int kmp(String s, String pat) {
        // next数组
        int[] next = getNextArray(pat.toCharArray());

        // 匹配
        int p = 0;
        for (int i = 0; i < s.length(); ) {
            // p==-1 表示当前没有任何匹配
            if (p == -1 || s.charAt(i) == pat.charAt(p)) {
                p++;
                i++;
                if (p >= pat.length()) {
                    return i - pat.length();
                }
            } else {
                p = next[p];
            }
        }

        return -1;
    }

    public int[] getNextArray(char[] chars) {
        int[] next = new int[chars.length];
        next[0] = -1;

        int p = -1;
        int i = 0;

        while (i < chars.length - 1) {
            if (p == -1 || chars[p] == chars[i]) {
                p++;
                i++;
                next[i] = p;
            } else {
                p = next[p];
            }
        }

        return next;
    }

    public int kmp2(String s, String pa) {
        char[] pat = pa.toCharArray();

        int[] next = getNextArray2(pat);

        int p = 0;
        int i = 0;
        while (i < s.length()) {
            if (p == -1 || pat[p] == s.charAt(i)) {
                p++;
                i++;
                if (p >= pat.length) {
                    return i - p;
                }
            }else {
                p = next[p];
            }
        }

        return -1;

    }

    private int[] getNextArray2(char[] pat) {
        int[] next = new int[pat.length];
        next[0] = -1;
        int p = -1;
        int i = 0;
        while (i < pat.length - 1) {
            if (p == -1 || pat[p] == pat[i]) {
                p++;
                i++;
                next[i] = p;
            }else{
                p = next[p];
            }
        }
        return next;
    }
}
