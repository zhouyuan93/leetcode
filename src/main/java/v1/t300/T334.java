package v1.t300;

public class T334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int i = 0;
        int p1 = nums[0];
        int p2 = p1 - 1;
        while (i < nums.length - 1) {
            i++;
            if (nums[i] < p1) {
                p1 = nums[i];
            } else if (nums[i] > p1) {
                p2 = nums[i];
                break;
            }
        }

        if (p2 < p1) {
            return false;
        }


        int tempP1 = p1;
        while (i < nums.length - 1) {
            i++;
            if (nums[i] > p2) {
                return true;
            } else if (nums[i] < p2) {
                if (nums[i] > tempP1) {
                    p1 = tempP1;
                    p2 = nums[i];
                } else {
                    tempP1 = nums[i];
                }

                if (nums[i] > p1) {
                    p2 = nums[i];
                } else if (nums[i] < p1) {
                    tempP1 = nums[i];
                }
            }
        }

        return false;
    }
}
