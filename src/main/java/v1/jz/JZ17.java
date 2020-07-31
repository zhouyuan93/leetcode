package v1.jz;

/**
 * @author yuan.zhou
 */
public class JZ17 {
    public int[] printNumbers(int n) {

        int max = 1;
        for(int i = 0 ; i < n ; i++){
            max *= 10;
        }

        int[] res = new int[max-1];

        for (int i=0 ; i < max-1 ; i++){
            res[i] = i+1;
        }

        return res;
    }
}
