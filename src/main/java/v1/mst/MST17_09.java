package v1.mst;

public class MST17_09 {
    public int getKthMagicNumber(int k) {
        int[] numList = new int[k + 1];
        int p3 = 0;
        int p5 = 0;
        int p7 = 0;
        numList[0] = 1;

        int n3 = numList[p3] * 3;
        int n5 = numList[p5] * 5;
        int n7 = numList[p7] * 7;
        for (int i = 1; i < k; i++) {
            if (n3 <= n5 && n3 <= n7) {
                if (n5 == n3) {
                    numList[i] = n5;
                    p5++;
                    n5 = numList[p5] * 5;
                }
                if (n7 == n3) {
                    numList[i] = n7;
                    p7++;
                    n7 = numList[p7] * 7;
                }
                numList[i] = n3;
                p3++;
                n3 = numList[p3] * 3;
            } else if (n5 <= n7) {
                if (n7 == n5) {
                    numList[i] = n7;
                    p7++;
                    n7 = numList[p7] * 7;
                }
                numList[i] = n5;
                p5++;
                n5 = numList[p5] * 5;
            } else {
                numList[i] = n7;
                p7++;
                n7 = numList[p7] * 7;
            }
        }
        return numList[k - 1];
    }

}
