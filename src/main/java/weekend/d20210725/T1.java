package weekend.d20210725;

public class T1 {
    public int getLucky(String s, int k) {
        int count  = 0;

        for (int i = 0; i < s.length(); i++) {
            int  c = s.charAt(i) - 'a';
            count += c / 10;
            count += c % 10;
        }

        return get(count, k - 1);

    }

    public int get(int s, int k) {
        if (k == 0) {
            return s;
        }

        int count = 0;

        while (s > 0) {
            count += s % 10;
            s /= 10;
        }

        return get(count, k - 1);
    }
}
