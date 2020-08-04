package v1.t300;

/**
 * @author yuan.zhou
 */
public class T367 {

    public boolean isPerfectSquare(int num) {
        if(num < 1 || num > 2147395600){
            return false;
        }
        if (num == 2147395600 || num == 1) {
            return true;
        }
        int min = 0;
        int max = 46340;


        while (min+1 < max) {
            int temp = (min + max) / 2;
            int sqrt = temp*temp;
            if (sqrt == num) {
                return true;
            } else if (sqrt < num) {
                min = temp;
            }else{
                max = temp;
            }
        }
        return false;

    }
}
