package v1;

public class T12 {
    public static void main(String[] args) {
        T12 t = new T12();
        System.out.println(t.intToRoman(1000));
    }
    public String intToRoman(int num) {
        String[] M = {"", "M", "MM", "MMM"}; //1000 2000 3000
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};//100 200 300 400 ... 900
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[(num%10)/1];
    }
}
