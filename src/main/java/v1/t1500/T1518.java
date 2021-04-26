package v1.t1500;

public class T1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        int x = numBottles ;
        while (x >= numExchange) {
            numBottles = x / numExchange;
            res += numBottles;
            x = x % numExchange + numBottles;
        }
        return res;
    }

}
