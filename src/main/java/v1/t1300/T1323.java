package v1.t1300;

public class T1323 {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                int temp = 3;
                while (i+1 < s.length()) {
                    i++;
                    temp *= 10;
                }
                return num + temp;
            }
        }
        return num;
    }
}
