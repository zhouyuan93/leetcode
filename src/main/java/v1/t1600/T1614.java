package v1.t1600;

public class T1614 {
    public int maxDepth(String s) {

        int res = 0;
        int size = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                size++;
                res = Math.max(res, size);
            } else if (c == ')') {
                size--;
            }
        }

        return res;

    }
}
