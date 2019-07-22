package v1;

import java.util.stream.Stream;

public class T38 {


    public static void main(String[] args) {
        T38 t = new T38();

        Stream.iterate(1, i -> i+1).limit(1)
                .map(t::countAndSay).forEach(System.out::println);


    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        char[] beforeRes = countAndSay(n - 1).toCharArray();

        String res = "";
        char i = beforeRes[0];
        int count = 0;
        for (char c : beforeRes) {
            if (c == i) {
                count++;
            }else{
                res = String.format("%s%d%s", res, count, i);
                i = c;
                count = 1;
            }
        }
        res = String.format("%s%d%s", res, count, i);
        return res;
    }
}
