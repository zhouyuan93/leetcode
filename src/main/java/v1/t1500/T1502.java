package v1.t1500;

/**
 * @author yuan.zhou
 */
public class T1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        if (max == min) {
            return true;
        }
        if ((max - min) % (arr.length - 1) != 0) {
            return false;
        }
        int x = (max - min) / (arr.length - 1);
        int[] index = new int[arr.length];
        for (int i : arr) {
            int sub = i - min;
            if (sub % x != 0) {
                return false;
            }
            int j = sub / x;
            if (index[j] == 1) {
                return false;
            }else{
                index[j] = 1;
            }
        }
        return true;
    }
}
