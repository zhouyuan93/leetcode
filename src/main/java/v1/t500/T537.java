package v1.t500;

public class T537 {


    public String complexNumberMultiply(String num1, String num2) {

        int[] a = trans(num1);
        int[] b = trans(num2);

        int x = a[0] * b[0] - a[1] * b[1];
        int y = a[0] * b[1] + a[1] * b[0];

        return x + "+" + y + "i";
    }

    public int[] trans(String num) {

        int[] res = new int[2];

        int len = num.length();

        int p = 0;
        for (int i = 0; i < len; i++) {
            if (num.charAt(i) == '+') {
                res[0] = Integer.parseInt(num.substring(p, i));
                p = i + 1;
            }
            if (num.charAt(i) == 'i') {
                res[1] = Integer.parseInt(num.substring(p,i));
            }
        }

        return res;
    }
}
