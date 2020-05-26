package v1;

/**
 * @author yuan.zhou
 */
public class T125 {
    public boolean isPalindrome(String s) {
        char[] sChars = s.toCharArray();

        int left = 0;
        int right = sChars.length - 1;

        while (left < right) {
            char cl = sChars[left];
            if ((cl<'A' || cl>'Z') && (cl<'a' || cl>'z') && (cl<'0' || cl>'9')) {
                left++;
                continue;
            }

            char cr = sChars[right];
            if ((cr<'A' || cr>'Z') && (cr<'a' || cr>'z') && (cr<'0' || cr>'9')) {
                right--;
                continue;
            }

            if (cl >= 'A' && cl <= 'Z') {
                cl += 32;
            }

            if (cr >= 'A' && cr <= 'Z') {
                cr += 32;
            }
            if (cl - cr != 0) {
                return false;
            }

            left++;
            right--;
        }
        return true;

    }
}
