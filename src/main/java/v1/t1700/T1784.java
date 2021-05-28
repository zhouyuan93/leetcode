package v1.t1700;

public class T1784 {
    public boolean checkOnesSegment(String s) {

        boolean contain = false;
        boolean doing = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                if (!doing) {
                    return false;
                }
                if (!contain) {
                    contain = true;
                    doing = true;
                }
            } else if (contain && doing) {
                doing = false;
            }
        }

        return true;
    }
}
