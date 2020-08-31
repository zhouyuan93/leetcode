package v1.t800;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author yuan.zhou
 */
public class T846 {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) {
            return false;
        }

        Arrays.sort(hand);

        Queue<Integer> needInt = new PriorityQueue<>();

        for (int i = 0; i < hand.length; i++) {
            if (needInt.size() == 0 || needInt.peek() != hand[i]) {
                for (int j = 1; j < W; j++) {
                    needInt.offer(hand[i] + j);
                }
            }else{
                needInt.poll();
            }

            if (needInt.size() > hand.length - i + 1) {
                return false;
            }
        }

        return needInt.size() == 0;

    }
}
