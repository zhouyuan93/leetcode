package v1.t600;

public class T633 {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c);
        while (a <= b) {
            int x = a * a + b * b;
            if (x > c) {
                b--;
            } else if (x < c){
                a++;
            }else{
                return true;
            }

        }
        return false;
    }
}
