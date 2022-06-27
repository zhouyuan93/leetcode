package v1.t2200;

public class T2259 {
    public String removeDigit(String number, char digit) {

        int p = -1;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c == digit) {
                if (i + 1 < number.length() && number.charAt(i+1) > c) {
                    return number.substring(0, i) + number.substring(i + 1);
                }else{
                    p = i;
                }
            }

        }

        return number.substring(0, p) + number.substring(p + 1);


    }
}
