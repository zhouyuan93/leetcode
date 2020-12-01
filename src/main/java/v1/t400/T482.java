package v1.t400;

/**
 * @author yuan.zhou
 */
public class T482 {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder res = new StringBuilder();

        int flag = 0;
        for (int i = S.length()-1; i >= 0 ; i--) {
            char x = S.charAt(i);
            if (x == '-') {
                continue;
            }
            x = Character.toUpperCase(x);

            if (flag == K) {
                res.insert(0,'-');
                flag = 0;
            }

            res.insert(0,x);
            flag++;

        }

        return res.toString();
    }
}
