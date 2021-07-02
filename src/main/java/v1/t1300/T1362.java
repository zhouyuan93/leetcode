package v1.t1300;

public class T1362 {
    public int[] closestDivisors(int num) {
        int min = (int) Math.pow(num+2, 0.5);
        int t = num+1;

        int n1 = num + 1;
        int n2 = num + 2;

        while (min > 1) {
            if (n1 % min == 0) {
                t = n1 / min;
                break;
            }
            if (n2 % min == 0) {
                t = n2 / min;
                break;
            }
            min--;
        }

        return new int[]{min , t};

    }
}
