package v1.t900;

/**
 * @author yuan.zhou
 */
public class T990 {
    public boolean equationsPossible(String[] equations) {
        char[] c = new char[26];
        //先处理等于
        for (String equation : equations) {
            char x = equation.charAt(0);
            char type = equation.charAt(1);
            char y = equation.charAt(3);

            if (type == '=') {
                int localX = x - 'a';
                int localY = y - 'a';
                if (c[localX] == 0 && c[localY] == 0) {
                    c[localX] = x;
                    c[localY] = x;
                } else if (c[localX] == 0 && c[localY] != 0) {
                    c[localX] = c[localY];
                } else if (c[localX] != 0 && c[localY] == 0) {
                    c[localY] = c[localX];
                }else if (c[localX] != c[localY]) {
                    //不相等触发合并
                    char change = c[localY];
                    for (int i = 0; i < c.length; i++) {
                        if (c[i] == change) {
                            c[i] = c[localX];
                        }
                    }
                }
            }
        }
        //再校验不等于
        for (String equation : equations) {
            char x = equation.charAt(0);
            char type = equation.charAt(1);
            char y = equation.charAt(3);

            if (type == '!') {
                int localX = x - 'a';
                int localY = y - 'a';
                if (c[localX] == 0) {
                    c[localX] = x;
                }
                if (c[localY] == 0) {
                    c[localY] = y;
                }
                if (c[localX] == c[localY]) {
                    return false;
                }
            }
        }

        return true;
    }
}
