package v1;

public class MST46 {
    public int translateNum(int num) {
        if (num < 10) {
            return 1;
        }
        if (num < 26) {
            return 2;
        }

        char[] c = String.valueOf(num).toCharArray();

        int[] numArray = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            numArray[i] = c[i] - '0';
        }

        int[] memory = new int[c.length];


        memory[0] = 1;

        int res = 0;
        if (numArray[1] + numArray[0] * 10 < 26 && numArray[1] + numArray[0] * 10 > 9) {
            res = 2;
        }else{
            res = 1;
        }
        memory[1] = res;



        int before = numArray[1];
        int now = 0;
        for (int i = 2; i < c.length; i++) {
            now = numArray[i];
            if (before == 0) {
                res = memory[i - 1];
            } else if (before == 1) {
                res = memory[i - 1] + memory[i - 2];
            } else if (before == 2 && now < 6) {
                res = memory[i - 1] + memory[i - 2];
            } else {
                res = memory[i - 1];
            }
            memory[i] = res;
            before = now;
        }

        return res;

    }
}
