package v1.t800;

/**
 * @author yuan.zhou
 */
public class T860 {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0) {
            return true;
        }

        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            switch (bill) {
                case 5:
                    five++;
                    break;
                case 10:
                    if (five < 0) {
                        return false;
                    }
                    five--;
                    ten++;
                    break;
                case 20:
                    if (ten > 0 && five > 0) {
                        ten--;
                        five--;
                    } else if (five >= 3) {
                        five -= 3;
                    }else{
                        return false;
                    }
                    break;
                default:
                    throw new RuntimeException("bill error");
            }
        }

        return true;
    }
}
