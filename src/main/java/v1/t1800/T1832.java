package v1.t1800;

public class T1832 {
    public boolean checkIfPangram(String sentence) {
        int compare = 0x3ffffff;
        int x = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            x |= 1 << (c - 'a');
            if (x == compare) {
                return true;
            }
        }
        return false;
    }
}
