package v1;

public class T9 {
    public static void main(String[] args) {
        T9 t = new T9();
        System.out.println(t.isPalindrome(123));
        System.out.println(t.isPalindrome(121));
    }
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int xt = 0;
        int temp = x;
        while (temp != 0) {
            xt = xt*10 + temp % 10;
            temp = temp / 10;
        }
        return xt == x;
    }
}
