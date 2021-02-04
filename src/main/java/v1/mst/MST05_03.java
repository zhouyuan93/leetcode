package v1.mst;

/**
 * @author yuan.zhou
 */
public class MST05_03 {

    public int reverseBits(int num) {
        int max = 0;

        int before = num < 0 ? -1 : 0;
        int now = 0;
        String bi = Integer.toBinaryString(num);
        for (int i = 0; i < bi.length(); i++) {
            if (bi.charAt(i) == '1') {
                now++;
            }else{
                max = Math.max(max, before + now);
                before = now;
                now = 0;
            }
        }
        max = Math.max(max, before + now);

        return max + 1;
    }
}
