package v1.t1400;

/**
 * @author yuan.zhou
 */
public class T1410 {
    public String entityParser(String text) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '&') {
                if (i + 5 < text.length() && text.charAt(i + 5) == ';' && text.charAt(i + 1) == 'q'
                        && text.charAt(i + 2) == 'u' && text.charAt(i + 3) == 'o' && text.charAt(i + 4) == 't') {
                    res.append('"');
                    i += 5;
                    continue;
                }
                if (text.charAt(i + 1) == 'a') {
                    if (i + 5 < text.length() && text.charAt(i + 5) == ';' && text.charAt(i + 2) == 'p'
                            && text.charAt(i + 3) == 'o' && text.charAt(i + 4) == 's') {
                        res.append('\'');
                        i += 5;
                        continue;
                    }
                    if (i + 4 < text.length() && text.charAt(i + 4) == ';' && text.charAt(i + 2) == 'm'
                            && text.charAt(i + 3) == 'p') {
                        res.append('&');
                        i += 4;
                        continue;
                    }
                }
                if (i + 3 < text.length() && text.charAt(i + 3) == ';' && text.charAt(i + 1) == 'g'
                        && text.charAt(i + 2) == 't') {
                    res.append('>');
                    i += 3;
                    continue;
                }
                if (i + 3 < text.length() && text.charAt(i + 3) == ';' && text.charAt(i + 1) == 'l'
                        && text.charAt(i + 2) == 't') {
                    res.append('<');
                    i += 3;
                    continue;
                }
                if (i + 6 < text.length() && text.charAt(i + 6) == ';' && text.charAt(i + 1) == 'f'
                        && text.charAt(i + 2) == 'r'
                        && text.charAt(i + 3) == 'a' && text.charAt(i + 4) == 's' && text.charAt(i + 5) == 'l') {
                    res.append('/');
                    i += 6;
                    continue;
                }
            }
            res.append(text.charAt(i));
        }

        return res.toString();
    }
}
