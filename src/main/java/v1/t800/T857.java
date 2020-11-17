package v1.t800;

/**
 * @author yuan.zhou
 */
public class T857 {
    public int minEatingSpeed(int[] piles, int H) {
        int max = 0;
        int sum = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
            sum += pile;
        }

        int left = sum / H;
        int right = max;

        while (right - left > 1) {
            int temp = (right + left) / 2;
            if (validate(piles, H, temp)) {
                right = temp;
            }else{
                left = temp;
            }
        }

        return right;

    }

    public boolean validate(int[] piles, int H, int x) {
        int usedHours = 0;
        for (int pile : piles) {
            usedHours += pile / x;
            if (pile % x != 0) {
                usedHours++;
            }
            if (usedHours > H) {
                return false;
            }
        }
        return true;
    }
}
