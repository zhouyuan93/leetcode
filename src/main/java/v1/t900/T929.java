package v1.t900;

import java.util.HashSet;
import java.util.Set;

public class T929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> res = new HashSet<>();

        for (String email : emails) {
            res.add(trans(email));
        }

        return res.size();
    }

    public String trans(String email) {
        StringBuilder sb = new StringBuilder();

        boolean hasAdd = false;

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (c == '@') {
                sb.append(email.substring(i));
                break;
            }
            if (hasAdd) {
                continue;
            }
            if (c == '.') {
                continue;
            }
            if (c == '+') {
                hasAdd = true;
                continue;
            }
            sb.append(c);
        }

        return sb.toString();

    }


}
