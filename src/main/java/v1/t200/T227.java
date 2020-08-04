package v1.t200;

public class T227 {
    public int calculate(String s) {
        if (s == null) {
            return 0;
        }
        Integer x = 0;
        Integer y = 0;
        Integer z = 0;
        String m = "";
        String n = "";

        m = "+";
        int j;

        int num = 0;
        for (j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c == ' ') {
                continue;
            }
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                n = String.valueOf(c);
                j++;
                break;
            } else {
                num = num * 10 + c - '0';
                y = num;
            }
        }

        if (j >= s.length()) {
            return y;
        }

        num = 0;
        for (; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c == ' ') {
                continue;
            }
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                z = num;
                if (n.equals("*") || n.equals("/")) {
                    y = calc(y, n, z);
                } else {
                    x = calc(x, m, y);
                    m = n;
                    y = z;
                }
                n = String.valueOf(c);
                num = 0;
            } else {
                num = num * 10 + c - '0';
            }
        }

        z = num;
        if (n.equals("*") || n.equals("/")) {
            y = calc(y, n, z);
        } else {
            x = calc(x, m, y);
            m = n;
            y = z;
        }

        return calc(x, m, y);
    }

    private int calc(int x, String sCal, int y) {
        switch (sCal) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
                return 0;
        }
    }

}
