package v1.t900;

/**
 * @author yuan.zhou
 */
public class T917 {
    public String reverseOnlyLetters(String S) {
        char[] res = S.toCharArray();
        int left = 0;
        int right = res.length - 1;
        while (left < right) {
            while (left < res.length && !isChar(res[left])) {
                left++;
            }
            while (right >= 0 && !isChar(res[right])) {
                right--;
            }
            if (left >= right) {
                break;
            }
            char temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }

        return new String(res);

    }

    public boolean isChar(char x) {
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }
}
