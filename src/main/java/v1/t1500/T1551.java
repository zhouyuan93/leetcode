package v1.t1500;

/**
 * @author yuan.zhou
 */
public class T1551 {
    public int minOperations(int n) {
        if (n % 2 == 1) {
            return getSum(n) - getSum(n / 2 + 1) - getSum(n / 2);
        }else{
            return getSum(n) - getSum(n / 2) * 2;
        }

    }

    public int getSum(int n) {
        return (n - 1)  * n / 2;
    }
}
