package v1.t0;

/**
 * @author yuan.zhou
 */
public class T67 {

    public String addBinary(String a, String b) {
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        StringBuilder res = new StringBuilder();

        int ai = aChar.length-1, bi = bChar.length-1;
        int carryOne = 0;
        for (; ai >= 0 && bi >= 0; bi--, ai--) {
            int tempSum = aChar[ai] + bChar[bi] - 2 * '0' + carryOne;
            carryOne = tempSum > 1 ? 1 : 0;
            res.append(tempSum & 1);
        }
        for (; bi >= 0; bi--) {
            if (carryOne == 0) {
                res.append(bChar[bi]);
            } else {
                int tempSum = bChar[bi] - '0' + carryOne;
                carryOne = tempSum > 1 ? 1 : 0;
                res.append(tempSum & 1);
            }
        }
        for (; ai >= 0; ai--) {
            if (carryOne == 0) {
                res.append(aChar[ai]);
            } else {
                int tempSum = aChar[ai] - '0' + carryOne;
                carryOne = tempSum > 1 ? 1 : 0;
                res.append(tempSum & 1);
            }
        }
        if (carryOne > 0) {
            res.append("1");
        }

        return res.reverse().toString();
    }
}
