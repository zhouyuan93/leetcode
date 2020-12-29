package v1.mst;

/**
 * @author yuan.zhou
 */
public class MST01_03 {
    public String replaceSpaces(String S, int length) {
        String rep = "%20";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if (c == ' ') {
                res.append(rep);
            }else{
                res.append(c);
            }
        }

        return res.toString();
    }

}
