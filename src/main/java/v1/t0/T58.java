package v1.t0;

/**
 * @author yuan.zhou
 */
public class T58 {
    public int lengthOfLastWord(String s) {
        int res = 0;
        char[] sChar = s.toCharArray();
        int sLength = sChar.length;
        int p = sLength - 1;
        while (p >= 0) {
            if (sChar[p] == ' ' && res == 0) {
                p--;
                continue;
            }

            if (sChar[p] != ' ') {
                p--;
                res++;
            }else{
                break;
            }
        }

        return res;


    }
}
