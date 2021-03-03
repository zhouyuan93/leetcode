package v1.t800;

/**
 * @author yuan.zhou
 */
public class T824 {
    public String toGoatLatin(String S) {
        StringBuilder ans = new StringBuilder();

        StringBuilder end = new StringBuilder();
        end.append("maa");

        Character first = null;

        char x = S.charAt(0);
        if (x != 'a' && x != 'e' && x != 'i' && x != 'o' && x != 'u'
                && x != 'A' && x != 'E' && x != 'I' && x != 'O' && x != 'U') {
            first = x;
        } else {
            ans.append(x);
        }

        for (int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == ' ') {
                if (first != null) {
                    ans.append(first);
                }
                ans.append(end);
                ans.append(" ");

                end.append("a");

                i++;
                c = S.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    first = null;
                    ans.append(c);
                }else{
                    first = c;
                }
            }else{
                ans.append(c);
            }
        }

        if (first != null) {
            ans.append(first);
        }
        ans.append(end);

        return ans.toString();
    }
}
