package v1.t1400;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class T1447 {

    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n-1; i++) {
            for (int j = i+1; j <= n; j++) {
                if (gcd(i,j) == 1) {
                    res.add(i + "/" + j);
                }
            }
        }
        return res;
    }

    public int gcd (int a,int b){
        return b==0? a: gcd( b , a % b);
    }
}
