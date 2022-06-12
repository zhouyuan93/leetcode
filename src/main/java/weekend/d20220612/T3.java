package weekend.d20220612;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T3 {
    int res  ;
    public int distributeCookies(int[] cookies, int k) {
        Arrays.sort(cookies);

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int c : cookies) {
            sum += c;
            list.add(c);
        }

        int average = sum / k;

        int[] p = new int[k];


        for (int i = 0; i < cookies.length; i++) {
            for (int j = 0; j < p.length; j++) {
                p[j] += cookies[i];

                p[j] -= cookies[i];
            }
        }

        return -1;


    }

}
