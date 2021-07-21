package v1.t900;

public class T925 {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() == 0 && typed.length() == 0) {
            return true;
        }
        if (name.length() == 0 || typed.length() == 0 || name.charAt(0) != typed.charAt(0)) {
            return false;
        }

        int ni = 1;
        char b = name.charAt(0);

        for (int ti = 1; ti < typed.length(); ti++) {
            char c = typed.charAt(ti);
            char t = ni < name.length() ? name.charAt(ni) : b;
            if (t == c) {
                ni++;
                b = t;
            }else if(b == c){

            }else{
                return false;
            }
        }

        return ni >= name.length();

    }
}
