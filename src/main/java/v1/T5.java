package v1;

public class T5 {
    public static void main(String[] args) {
        T5 t = new T5();
        System.out.println(t.longestPalindrome("asdfffdsa"));
    }
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        //dp
        boolean dp[][] = new boolean[s.length()][s.length()];
        char[] sChar = s.toCharArray();
        int maxLength = 1;
        int x = 1;
        int y = 0;
        //初始化
        for (int i = 1; i < s.length(); i++) {
            for (int j = i; j >=0; j--) {
                if (sChar[j] == sChar[i] && (i <= j + 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > maxLength) {
                        maxLength = i - j + 1;
                        x = i+1;
                        y = j;
                    }
                }
            }
        }
        return s.substring(y,x);
    }
}
