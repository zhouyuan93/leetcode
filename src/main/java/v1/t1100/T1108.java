package v1.t1100;

/**
 * @author yuan.zhou
 */
public class T1108 {
    public String defangIPaddr(String address) {
        char[] res = new char[address.length() + 6];

        int p = 0;
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                res[p++] = '[';
                res[p++] = '.';
                res[p++] = ']';
            }else{
                res[p++] = c;
            }
        }

        return String.valueOf(res);

    }
}
