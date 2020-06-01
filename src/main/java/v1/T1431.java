package v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        List<Boolean> res = new ArrayList<>();
        max -= extraCandies;

        for (int candy : candies) {
            res.add(max <= candy);
        }

        return res;
    }
}
