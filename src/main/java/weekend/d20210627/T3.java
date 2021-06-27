package weekend.d20210627;

public class T3 {

    public long wonderfulSubstrings(String word) {
        long res = word.length();


        int[] memo = new int[word.length() + 1];
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            sum ^= (1 << idx);
            memo[i+1] = sum;


        }

        return res;

    }

    public boolean isMei(int x, int y) {
        int n = x ^ y;
        return (n & (n - 1)) == 0;
    }

}
