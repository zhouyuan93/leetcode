package history;

import java.util.HashMap;
import java.util.Map;

public class T13 {
    public static void main(String[] args) {
        T13 t = new T13();
        System.out.println(t.romanToInt("MCDXLIII"));
    }
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int res = 0;
        int perivous = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            int val = m.get(c);
            res += (perivous>val ? -1 : 1) * val;
            perivous = val;
        }
        return res;

    }

}
