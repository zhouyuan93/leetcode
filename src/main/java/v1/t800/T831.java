package v1.t800;

public class T831 {
    public String maskPII(String s) {
        s = s.trim();
        char c = s.charAt(0);
        if ('0' <= c && c <= '9' || c == '+' || c == '(' || c ==')' || c == '-') {
            return maskPhone(s);
        }

        return maskEmail(s);
    }

    public String maskEmail(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb.append("*****");
        boolean add = false;
        for (int i = 1; i < s.length(); i++) {
            if (add) {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == '@') {
                sb.append(s.charAt(i - 1));
                sb.append(s.charAt(i));
                add = true;
            }
        }
        return sb.toString().toLowerCase();
    }

    public String maskPhone(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int count = -1;
        for (int i = len - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if ('0' <= c && c <= '9') {
                if (count < 3) {
                    sb.append(c);
                }else {
                    if (count % 3 == 0) {
                        sb.append("-");
                    }
                    sb.append("*");
                }
                count++;
            }
        }
        if (count > 9) {
            sb.append("+");
        }
        return sb.reverse().toString();
    }
}
