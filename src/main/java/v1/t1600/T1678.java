package v1.t1600;

/**
 * @author yuan.zhou
 */
public class T1678 {
    public String interpret(String command) {
        StringBuilder res = new StringBuilder();

        char before = '-';
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            switch (c) {
                case 'G':
                    res.append('G');
                    break;
                case ')':
                    res.append(before == '(' ? "o" : "al");
                default:
            }
            before = c;
        }

        return res.toString();

    }
}
