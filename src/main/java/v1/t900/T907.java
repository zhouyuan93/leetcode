package v1.t900;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author yuan.zhou
 */
public class T907 {

    public static final int MOD = 1000000007;

    public int sumSubarrayMins(int[] A) {
        Stack<MinInteger> stack = new Stack<>();
        int res = 0;
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            int count = 1;

            while (!stack.isEmpty() && stack.peek().val >= A[i]) {
                MinInteger node = stack.pop();
                count += node.count;
                sum -= node.val * node.count;
            }
            stack.push(new MinInteger(A[i], count));
            sum += A[i] * count;
            res += sum;
            res %= MOD;
        }

        return res;

    }

    class MinInteger {
        int val;
        int count;

        public MinInteger(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }

}
